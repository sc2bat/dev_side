USE test01
GO

CREATE TABLE customer3(
name varchar(20),
phone varchar(11),
birthday datetime,
address varchar(100)
CONSTRAINT customer3_COMBO_PK PRIMARY KEY(name, phone)
)