USE MagicCorp
GO

SELECT DNO, AVG(SALARY) AS AVG_SAL
FROM EMPLOYEE
GROUP BY DNO