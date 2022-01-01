USE MagicCorp
GO

BEGIN TRAN

DELETE FROM DEPT01 WHERE DNO = 10
SELECT * FROM DEPT01

INSERT INTO DEPT01 VALUES (NULL, 'PRODUCT', 'Seoul')

IF @@ERROR <> 0 GOTO ERROR_ROLLBACK

COMMIT TRAN
RETURN

ERROR_ROLLBACK:
ROLLBACK TRAN
GO

SELECT * FROM DEPT01
GO