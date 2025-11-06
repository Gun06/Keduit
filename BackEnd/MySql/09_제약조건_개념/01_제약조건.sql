CREATE DATABASE db2_member;

USE db2_member;

-- NOT NULL : 값을 넣지 않으면 오류발생
/*
	[NULL]
    : NULL은 어떠한 값도 정의되지 않은 상태를 의미한다.
    -----------------------------------------------------------
    - 테이블을 생성할 때 특별한 설정을 하지 않으면, NULL을 허용한다.
    - NULL을 허용하지 않도록 설정하려면 NOT NULL 조건을 설정해야 한다.
*/


-- PRIMARY KEY : 고유번호라는 의미로 같은 값을 저장할 수 없다.
-- AUTO_INCREMENT : 값을 넣지 않아도 1씩 자동증가된다.

CREATE TABLE member1(
	num INT NOT NULL,
    name VARCHAR(20) NOT NULL,
    score INT
);

INSERT INTO member1 VALUES(null, null, 10);		-- 오류 발생
INSERT INTO member1 VALUES(1003, '이만수', 10);
SELECT * FROM member1;

CREATE TABLE member2(
	num INT,
    name VARCHAR(20) NOT NULL,
    PRIMARY KEY(num)		-- 중복 숫자를 넣을 수 없다.
);

INSERT INTO member2 VALUES(1, '김철수');
INSERT INTO member2 VALUES(2, '김철수');
INSERT INTO member2 VALUES(2, '김철수');	-- 오류 발생
SELECT * FROM member2;

CREATE TABLE member3(
	num INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(20) NOT NULL
);

INSERT member3(name) VALUES('이만수');
INSERT member3(name) VALUES('김철수');
INSERT member3(name) VALUES('박철민');
SELECT * FROM member3;

















-- INSERT INTO와 SELECT로 다른 테이블에 결과 입력
CREATE TABLE doit_insert_select_from (
col_1 INT,
col_2 VARCHAR(10)
);

CREATE TABLE doit_insert_select_to (
col_1 INT,
col_2 VARCHAR(10)
);

INSERT INTO doit_insert_select_from VALUES (1, 'Do');
INSERT INTO doit_insert_select_from VALUES (2, 'It');
INSERT INTO doit_insert_select_from VALUES (3, 'MySQL');

INSERT INTO doit_insert_select_to
SELECT * FROM doit_insert_select_from;

SELECT * FROM doit_insert_select_to;

-- INSERT INTO와 SELECT로 다른 테이블에 결과 입력
CREATE TABLE doit_select_new AS (SELECT * FROM doit_insert_select_from);

SELECT * FROM doit_select_new;

-- 부모 테이블과 자식 테이블 생성
CREATE TABLE doit_parent (col_1 INT PRIMARY KEY);
CREATE TABLE doit_child (col_1 INT);

ALTER TABLE doit_child
ADD FOREIGN KEY (col_1) REFERENCES doit_parent(col_1);

-- 자식 테이블에 데이터 입력 시 부모 테이블에 해당 데이터가 없는 경우(오류 발생)
INSERT INTO doit_child VALUES (1);

-- 부모 테이블에 데이터 입력 후 자식 테이블에도 데이터 입력
INSERT INTO doit_parent VALUES (1);
INSERT INTO doit_child VALUES (1);

SELECT * FROM doit_parent;
SELECT * FROM doit_child;

-- 부모 테이블에서만 데이터를 삭제한 경우(오류)
DELETE FROM doit_parent WHERE col_1 = 1;

-- 자식 테이블의 데이터 삭제 후 부모 테이블의 데이터 삭제
DELETE FROM doit_child WHERE col_1 = 1;
DELETE FROM doit_parent WHERE col_1 = 1;

-- 부모 테이블을 삭제할 경우(오류)
DROP TABLE doit_parent;

-- 하위 테이블 삭제 후 상위 테이블 삭제
DROP TABLE doit_child;
DROP TABLE doit_parent;