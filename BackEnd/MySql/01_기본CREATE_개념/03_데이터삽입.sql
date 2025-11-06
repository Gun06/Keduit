/*
	[데이터 삽입]
    : 생성된 테이블에 데이터를 추가하는 명령어 INSERT
    -----------------------------------------------------------
    INSERT INTO 테이블 ([컬럼1, 컬럼2, ...]) VALUES ([값1, 값2, ..]);
    -----------------------------------------------------------
*/
-- 1단계) 사용할 DB 선택
USE hellosql;
-- 2단계) 테이블 생성
CREATE TABLE insert_table (
	a INT,					-- 숫자형
    b VARCHAR(50),			-- 문자형
    c DATETIME				-- 날짜형
);
-- 3단계) 데이터 추가
INSERT INTO insert_table (a, b, c) VALUES (1, '값1', '2025-10-20');
-- 4단계) 전체 데이터 조회
SELECT * FROM insert_table;

/*
	[데이터 삽입의 다양한 방법]
*/
-- 1번 방법) 컬럼명 작성
INSERT INTO insert_table (a, b, c) VALUES( 2, '값2', '2025-10-21');
-- 컬럼명을 작성하는 경우, 컬럼명과 데이터를 맞춰 나열하면 데이터의 순서를 바꿀 수도 있다. 
INSERT INTO insert_table (c, b, a) VALUES ('2025-10-22', '값3', 3);
-- 컬럼명을 작성하는 경우, 원하는 컬럼에만 데이터를 삽입할 수 있다.
INSERT INTO insert_table (a, b) VALUES (4, 'c컬럼 값 생략');
SELECT * FROM insert_table;

-- 2번 방법) 컬럼명 생략
INSERT INTO insert_table VALUES (5, '값5', '2025-10-23');
-- (오류) 컬럼명을 생략하는 경우, 생성한 테이블의 컬럼 개수가 일치하지 않으면 오류가 발생한다.
-- Error Code: 1136. Column count doesn't match value count at row 1
INSERT INTO insert_table VALUES (6, 'c컬럼 값 생략');
SELECT * FROM insert_table;

-- 3번 방법) 여러 데이터 한 번에 삽입
INSERT INTO insert_table (a, b, c)
VALUES (7, '값7', '2025-10-24'), (8, '값8', '2025-10-25'), (9, '값9', '2025-10-26');
SELECT * FROM insert_table;

/*
	[데이터 삽입 주의사항]
    - 데이터를 삽입할 때에는 테이블을 생성할 때 지정한 데이터 유형과 맞지 않으면 오류가 발생한다.
*/
-- (오류) 데이터 타입의 불일치로 인해 오류가 발생한다.
-- Error Code: 1364. Field 'col_2' doesn't have a default value
INSERT INTO insert_table (a) VALUES ('문자입력');