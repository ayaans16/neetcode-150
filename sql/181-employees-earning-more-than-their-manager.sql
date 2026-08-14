# Write your MySQL query statement below
-- select name of employee and rename column to Employee
SELECT t1.name as Employee FROM Employee AS t1

-- inner join to get all values
INNER JOIN Employee AS t2

-- manager id = user ID
ON t1.managerId = t2.id

-- salary > manager salary
AND t1.salary > t2.salary; 
