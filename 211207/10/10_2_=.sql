USE MagicCorp
GO

SELECT ENO, DNO
FROM EMPLOYEE
WHERE EMPLOYEE.DNO = (SELECT DNO 
					FROM EMPLOYEE 
					WHERE EMPLOYEE.ENO = 110)