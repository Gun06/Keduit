/*
    [index]
    인덱스 는 컬럼별로 정렬할수있다. 
    하나의 컬럼으로 정렬할수도 있으며, 
    여러 컬럼으로 정렬할수도 있다.
*/

CREATE DATABASE test_index;

DROP TABLE IF EXISTS table_index;

CREATE TABLE table_index (
col_1 INT,
col_2 VARCHAR(50),
col_3 VARCHAR(50)
);

INSERT INTO table_index VALUES (2, '사자', 'lion');
INSERT INTO table_index VALUES (5, '호랑이', 'tiger');
INSERT INTO table_index VALUES (3, '얼룩말', 'zbera');
INSERT INTO table_index VALUES (4, '코뿔소', 'Rhinoceros');
INSERT INTO table_index VALUES (1, '거북이', 'turtle');

SELECT * FROM table_index;

-- 기본키(기본 인덱스) 생성
ALTER TABLE table_index
	ADD CONSTRAINT PRIMARY KEY (col_1);

SELECT * FROM table_index;

-- 새로운 데이터 입력
INSERT INTO table_index VALUES (0, '물고기', 'fish');

SELECT * FROM table_index;

-- col_2 열로 인덱스 변경
ALTER TABLE table_index
	DROP PRIMARY KEY,
	ADD CONSTRAINT PRIMARY KEY table_index (col_2);

SELECT * FROM table_index;

-- col_3 열로 인덱스 변경
ALTER TABLE table_index
	DROP PRIMARY KEY,
	ADD CONSTRAINT PRIMARY KEY (col_3);

SELECT * FROM table_index;


-- 복합키 인덱스 생성
ALTER TABLE table_index
	DROP PRIMARY KEY,
	ADD CONSTRAINT PRIMARY KEY(col_1, col_3);


-- 새로운 데이터 입력
INSERT INTO table_index VALUES (0, '새', 'bird');

SELECT * FROM table_index;

SHOW INDEX FROM table_index;

-- 인덱스 삭제
ALTER TABLE table_index DROP PRIMARY KEY;

SHOW INDEX FROM table_index;



