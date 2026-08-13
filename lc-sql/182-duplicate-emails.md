```sql
# Write your MySQL query statement below
SELECT email from PERSON
GROUP BY email
HAVING COUNT(*) > 1;
```
