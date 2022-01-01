CREATE TABLE 사원T (
	사원번호 CHAR(9) PRIMARY KEY,
    사원이름 CHAR(10) NOT NULL,
    전화번호 CHAR(13),
    주소 VARCHAR(200) NOT NULL,
    생년월일 DATE,
    성별 ENUM('F', 'M'),
    부서번호 CHAR(4),
    FOREIGN KEY (부서번호) REFERENCES 부서(부서번호)
);

ALTER TABLE 사원T
	ADD COLUMN 경력 VARCHAR(200);

ALTER TABLE 사원T
	DROP COLUMN 경력;

DROP TABLE 사원T;