INSERT INTO 부서 VALUES ('DP01', '시스템 개발', '02-XXXX-YYYY', '서울');
INSERT INTO 사원 VALUES ('EMP01', '홍길동', '010-XXXX-YYYY', '서울', '1984-12-10', '남', 'DP01');

START TRANSACTION
UPDATE 사원
	SET 성별 = '여'
    WHERE 사원번호 = 'EMP01';

SELECT * FROM 사원;

ROLLBACK;

SELECT * FROM 사원;


START transaction

LOCK TABLE 사원 WRITE;

UPDATE 사원
	SET 생년월일 = '1999-09-09'
    WHERE 사원번호 = 'EMP01';

UNLOCK TABLES;

COMMIT;


