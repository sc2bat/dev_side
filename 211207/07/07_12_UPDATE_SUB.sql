USE MagicCorp
GO

SELECT * FROM EMPTEST

UPDATE EMPTEST
SET MANAGER = (SELECT MANAGER FROM EMPLOYEE WHERE ENO = 101)
WHERE ENO = 50

SELECT * FROM EMPTEST