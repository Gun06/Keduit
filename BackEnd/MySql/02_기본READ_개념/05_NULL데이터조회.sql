/*
	[NULL 데이터 조회하기]
    -----------------------------------------------------------
    SELECT 컬럼 
    FROM 테이블
    WHERE 컬럼 IS NULL;
    -----------------------------------------------------------
    - NULL 이란 데이터가 없는 상태를 말한다.
    - 숫자 0, 공백이 아니라 아예 정의되지 않은 값을 말한다.
*/
# 데이터 베이스 사용하기
USE db1_book_store;

# 데이터 추가하기
INSERT INTO member VALUES (6, 'abcd', '1234', '널널', NULL, 0, '2024-05-16 08:30:11');
INSERT INTO member VALUES (7, 'hello', '', '하민정', 'w', 0, '2025-02-07 17:59:02');
SELECT * FROM member;

# = 연산자를 사용해 NULL 데이터 조회하기
# NULL 데이터는 = 연산자로 조회할 수 없다.
SELECT * FROM member
WHERE member_gender = NULL;

# NULL 데이터는 IS NULL을 사용해 조회할 수 있다.
SELECT * FROM member
WHERE member_gender IS NULL;

SELECT * FROM member
WHERE member_gender IS NOT NULL;

# 공백은 NULL이 아니기 때문에 연산자 = 으로 조회할 수 있다.
SELECT * FROM member
WHERE member_pw = '';