USE MagicCorp
GO

SELECT ENAME, SALARY, DNO
FROM EMPLOYEE
WHERE SALARY > ANY (SELECT SALARY
				FROM EMPLOYEE
				WHERE DNO =20)