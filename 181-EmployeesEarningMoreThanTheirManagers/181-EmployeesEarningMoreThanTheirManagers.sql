-- Last updated: 8/20/2026, 6:24:40 PM
# Write your MySQL query statement below
select e.name as employee
from employee e
join employee m
on e.managerId=m.id
where e.salary>m.salary;