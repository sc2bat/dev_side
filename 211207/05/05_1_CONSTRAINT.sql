USE test01
GO

CREATE TABLE customer(
id varchar(20) CONSTRAINT PK_01 PRIMARY KEY,
pwd varchar(20) CONSTRAINT NN_pwd NOT NULL,
name varchar(20) CONSTRAINT NN_name NOT NULL,
phone1 varchar(3) NULL,
phone2 varchar(8) NULL,
birthYear int NULL,
address varchar(100) NULL
)

INSERT INTO customer
VALUES('one', '1111', 'Kim', '010', '77727777', 1988, 'Daejeon')

INSERT INTO customer
VALUES('two', '2222', 'Lee', '010', '12345667', 2002, 'jeaju')
