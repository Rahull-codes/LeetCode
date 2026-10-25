# Write your MySQL query statement below
SELECT project_id ,
    ROUND( SUM(e.experience_years) / COUNT(p.project_id)  , 2) as average_years
FROM Project p
INNER JOIN Employee e
    ON e.employee_id = p.employee_id
GROUP BY Project_id;
