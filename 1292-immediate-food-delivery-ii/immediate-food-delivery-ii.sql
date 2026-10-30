-- SELECT ROUND( 
--             SUM(CASE 
--                     WHEN order_date = customer_pref_delivery_date 
--                     THEN 1 ELSE 0 END) * 100 / COUNT(DISTINCT customer_id ),
--                     2 ) AS immediate_percentage 
-- FROM Delivery 
-- WHERE customer_id , MIN(order_date )

WITH MinOrders AS (
    SELECT
        customer_id
        , MIN(order_date) AS order_date
    FROM
        Delivery
    GROUP BY
        customer_id
)
SELECT
    ROUND(COUNT(m.customer_id)*100/(SELECT count(DISTINCT customer_id) FROM Delivery), 2) as immediate_percentage
FROM
    MinOrders AS m
INNER JOIN
    Delivery AS d
ON
    m.customer_id = d.customer_id
    AND
    m.order_date = d.customer_pref_delivery_date;

