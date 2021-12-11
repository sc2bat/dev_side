USE test01
GO

CREATE TABLE orders5(
oseq int IDENTITY(1,1),
quantity varchar(20) NULL,
indate datetime NULL,
id varchar(20),
pcode varchar(20)
)
ALTER TABLE orders5
ADD CONSTRAINT PK_oseq5	PRIMARY KEY(oseq)

ALTER TABLE orders5
ADD CONSTRAINT FK_id5
FOREIGN KEY(id) REFERENCES customer(id)

ALTER TABLE orders5
DROP CONSTRAINT FK_id5