SELECT 
    Name, 
    JoinDate 
FROM 
    employees
WHERE 
    TIMESTAMPDIFF(DAY, JoinDate, CURDATE()) <= 30;