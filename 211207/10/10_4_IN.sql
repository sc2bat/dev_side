USE MagicCorp
GO

SELECT ENAME, SALARY, DNO
FROM EMPLOYEE
WHERE DNO IN (SELECT DNO
			FROM EMPLOYEE
			WHERE SALARY >= 500)