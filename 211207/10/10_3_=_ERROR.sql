USE MagicCorp
GO

SELECT ENAME, SALARY, DNO
FROM EMPLOYEE
WHERE DNO = (SELECT DNO
			FROM EMPLOYEE
			WHERE SALARY >= 500)