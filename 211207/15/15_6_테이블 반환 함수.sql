USE MagicCorp
GO

CREATE FUNCTION EMP_DEPT
(@para INT)
RETURNS @EMP_DEPT_TABLE	 TABLE(
	EMP_ID INT, 
	EMP_NAME VARCHAR(20)
	)
AS
BEGIN

INSERT INTO @EMP_DEPT_TABLE
SELECT EMPLOYEE.ENO, EMPLOYEE.ENAME
FROM EMPLOYEE
WHERE DNO = @para

RETURN
END

GO

SELECT *
FROM dbo.EMP_DEPT(20)