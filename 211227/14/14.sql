CREATE USER 'student'@'localhost' IDENTIFIED BY '12345';

GRANT INSERT ON company.* TO 'student'@'localhost';

GRANT SELECT(사원번호, 사원이름, 전화번호) ON company.사원
	TO 'student'@'localhost';

REVOKE SELECT(전화번호) ON company.사원
	FROM 'student'@'localhost';
