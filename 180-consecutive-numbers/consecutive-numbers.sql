# Write your MySQL query statement below
SELECT DISTINCT num AS ConsecutiveNums
FROM Logs l
WHERE num = (
    SELECT num
    FROM Logs
    WHERE id = l.id + 1
)
AND num = (
    SELECT num
    FROM Logs
    WHERE id = l.id + 2
);