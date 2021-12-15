USE MagicCorp
GO

SELECT ENAME, GRADE, DNAME
FROM EMPLOYEE, SALGRADE, DEPARTMENT
WHERE SALARY BETWEEN LOWSAL AND HIGHSAL
AND EMPLOYEE.DNO = DEPARTMENT.DNO