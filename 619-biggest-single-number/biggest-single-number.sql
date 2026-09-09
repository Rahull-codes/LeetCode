# Write your MySQL query statement below
SELECT MAX(num) num
FROM MyNumbers N
WHERE num IN (SELECT num 
FROM MyNumbers 
GROUP BY num
HAVING COUNT(*) = 1
)