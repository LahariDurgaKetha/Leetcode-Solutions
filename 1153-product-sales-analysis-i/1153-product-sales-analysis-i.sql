# Write your MySQL query statement below
SELECT pt.product_name,s.year,s.price FROM Sales s
INNER JOIN Product pt
ON s.product_id = pt.product_id