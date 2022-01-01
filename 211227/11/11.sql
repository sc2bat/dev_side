-- SHOW INDEX FROM 테이블이름 FROM 스키마이름
SHOW INDEX FROM 사원 FROM company;

-- CREATE INDEX 인덱스이름
	-- ON 테이블이름(컬럼명1, 컬럼명2, ... 컬럼명n);
CREATE INDEX idx_사원_1
	ON 사원(사원이름);
    
-- DROP INDEX 인덱스이름 ON 테이블이름
DROP INDEX idx_사원_1 ON 사원;


SELECT COUNT(*) FROM sample_table;






