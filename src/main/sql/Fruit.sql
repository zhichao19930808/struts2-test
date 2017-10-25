CREATE TABLE db_test.db_fruit (
  id   INT PRIMARY KEY AUTO_INCREMENT
  COMMENT 'pk id',
  name VARCHAR(255) NOT NULL
  COMMENT '名称',
  kind VARCHAR(255) COMMENT '种类',
  time DATE COMMENT '生产日期'
);
SELECT *
FROM db_test.db_fruit;

INSERT INTO db_test.db_fruit (name, kind, time) VALUES ('apple', 'apple', '123');

DELETE FROM db_test.db_fruit
WHERE id = ?;

UPDATE db_test.db_fruit SET name=?,kind=?,time=? WHERE id=1;
SELECT * FROM db_test.db_fruit WHERE id=? AND 1 LIKE '%%';