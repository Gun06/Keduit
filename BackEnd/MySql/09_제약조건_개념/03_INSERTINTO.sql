-- 제약조건 내용은 아님

/*
    [조회 결과를 테이블에 입력하기]
    - 조회한 결과를 다른 테이블에 입력할 수 있다.
    - 이때 반드시 입력하려는 테이블과 조회한 컬럼의 데이터 유횽이 동일해야 한다.
*/

# autosql 이란 이름의 데이터베이스가 없는 경우, autosql 데이터베이스를 생성한다.
CREATE DATABASE IF NOT EXISTS insertsql;

USE insertsql;

# 첫 번째 테이블 생성
CREATE TABLE insert_table_from (
	col_1 INT,
    col_2 VARCHAR(10)
);
# 두 번째 테이블 생성
CREATE TABLE insert_table_to (
	col_1 INT,
    col_2 VARCHAR(10)
);

# 데이터 삽입
INSERT INTO insert_table_from VALUES(1, 'aaa');
INSERT INTO insert_table_from VALUES(2, 'bbb');
INSERT INTO insert_table_from VALUES(3, 'ccc');
SELECT * FROM insert_table_from;

INSERT INTO insert_table_to
SELECT * FROM INSERT_table_from;
SELECT * FROM insert_table_to;

/*
    [새 테이블에 조회 결과 입력하기]
    - 조회한 결과를 아예 새로운 테이블을 생성해 저장할 수도 있다.
*/
CREATE TABLE select_table
AS (SELECT * FROM insert_table_from);

SELECT * FROM select_table;