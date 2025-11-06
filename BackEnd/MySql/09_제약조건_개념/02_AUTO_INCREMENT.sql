/*
	[AUTO_INCREMENT로 데이터 자동 입력하기]
    -----------------------------------------------------------
    - 테이블을 생성할 때 어떤 컬럼에 AUTO_INCREMENT를 적용하면 해당 컬럼은 1씩
      또는 사용자가 정의한 값만큼 증가하며 데이터가 자동으로 입력된다.
    - 이때, AUTO_INCREMENT가 적용된 컬럼을 생성할 때에는 반드시 해당 컬럼을 기본키로 설정해 주어야 한다.
*/

# autosql 이란 이름의 데이터베이스가 없는 경우, autosql 데이터베이스를 생성한다.
CREATE DATABASE IF NOT EXISTS autosql;

USE autosql;

# 테이블 생성
CREATE TABLE auto_table (
	col_1 INT AUTO_INCREMENT PRIMARY KEY,
    col_2 VARCHAR(50),
    col_3 INT
);

/*
	[데이터 삽입2]
	- col_1 컬럼에는 값을 입력하지 않았지만,
    - AUTO_INCREMENT에 의해 자동으로 값이 증가되었다.
*/
# 
INSERT INTO auto_table (col_2, col_3) VALUES('1 자동입력', 1);
INSERT INTO auto_table (col_2, col_3) VALUES('2 자동입력', 2);
SELECT * FROM auto_table;

/*
	[데이터 삽입2]
    - AUTO_INCREMENT가 정의된 컬럼에 자동 입력되는 값과 동일한 값을 입력할 수 있다.
*/
INSERT INTO auto_table (col_1, col_2, col_3) VALUES(3, '3 자동입력', 3);
SELECT * FROM auto_table;

/*
	[데이터 삽입3]
	- 자동 입력되는 값보다 큰 값을 입력할 수 있으며, 다시 한 번 더 추가했을 때
      그 다음 값으로 자동 입력된다.
*/
INSERT INTO auto_table (col_1, col_2, col_3) VALUES(5, '4 건너뛰고 5 자동입력', 5);
SELECT * FROM auto_table;

INSERT INTO auto_table (col_2, col_3) VALUES('어디까지 입력되었을까?', 0);
SELECT * FROM auto_table;

/*
    [AUTO_INCREMENT로 생성된 마지막 값 확인하기]
    -----------------------------------------------------------
    SELECT LAST_INSERT_ID();
    -----------------------------------------------------------
    - 이 명령은 특정 테이블이나 컬럼을 직접 지정하지 않는다.
    - 방금 실행한 INSERT 문에서 자동으로 생성된 AUTO_INCREMENT 값을 반환하는 세션 단위 함수이다.
*/
SELECT LAST_INSERT_ID();

/*
    [AUTO_INCREMENT 시작값 변경하기]
    -----------------------------------------------------------
    ALTER TABLE 테이블 AUTO_INCREMENT = 값;
    -----------------------------------------------------------
*/

ALTER TABLE auto_table AUTO_INCREMENT = 100;

INSERT INTO auto_table (col_2, col_3) VALUES('시작값이 변경되었을까?', 0);
SELECT * FROM auto_table;

/*
    [AUTO_INCREMENT 증갓값 변경하기]
    -----------------------------------------------------------
    SET @@AUTO_INCREMENT_INCREMENT = 값;
    -----------------------------------------------------------
    - 증갓값을 수정하면 첫 데이터는 1이 증가하고,
    - 첫 데이터를 입력한 이후 데이터부터 5씩 증가한다.
*/

SET @@AUTO_INCREMENT_INCREMENT = 5;
INSERT INTO auto_table (col_2, col_3) VALUES('5씩 증가할까? (1)', 0);
INSERT INTO auto_table (col_2, col_3) VALUES('5씩 증가할까? (2)', 0);
SELECT * FROM auto_table;