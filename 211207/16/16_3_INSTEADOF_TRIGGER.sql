USE MagicCorp
GO

CREATE TRIGGER NO_UPDATE
ON DEPARTMENT
INSTEAD OF UPDATE
AS
BEGIN
PRINT('DEPARTMENT�� ���� UPDATE�� ���� ���ÿ�')

END