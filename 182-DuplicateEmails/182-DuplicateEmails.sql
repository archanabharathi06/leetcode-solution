-- Last updated: 8/20/2026, 6:24:38 PM
# Write your MySQL query statement below
select email
from person 
group by email
having count(email)>1;