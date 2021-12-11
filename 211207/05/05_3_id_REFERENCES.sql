USE test01
GO

CREATE TABLE orders(
oseg int IDENTITY(1, 1) CONSTRAINT PK_oseg PRIMARY KEY,
quantity varchar(20) NULL,
indate datetime NULL,
id varchar(20) CONSTRAINT FK_id REFERENCES customer(id)
)

INSERT INTO orders(quantity, id) VALUES(5, 'one')
INSERT INTO orders(quantity, id) VALUES(5, 'test')