/*
	[데이터 정렬하기]
    -----------------------------------------------------------
    SELECT 컬럼 
    FROM 테이블
    WHERE 컬럼 = 조건
    ORDER BY 컬럼 [ASC 또는 DESC];
    -----------------------------------------------------------
    - 정렬의 기본값은 오름차순이기 때문에 ASC는 생략할 수 있다.
    - ASC(ascending, 오름차순)
    - DESC(descending, 내림차순)
*/

# 데이터 베이스 사용하기
USE db1_book_store;

# 데이터 베이스 사용하기
USE db1_book_store;

SHOW TABLES;

DESC member;
DESC book;
DESC cart;

# 컬럼 전부 조회하기
SELECT * FROM member;
SELECT * FROM book;
SELECT * FROM cart;

/*
    정렬 기준이 1개 일 때
*/
# [문제] book테이블에서 도서명과 출판일 조회하기
# [조건] 출판일을 기준으로 정렬
SELECT book_publishing_date, book_title FROM book;
SELECT book_publishing_date, book_title FROM book ORDER BY book_publishing_date ASC;
SELECT book_publishing_date, book_title FROM book ORDER BY book_publishing_date DESC;

# [문제] member테이블에서 회원이름 조회하기
# [조건] 회원이름을 기준으로 정렬
SELECT member_name FROM member;
SELECT member_name FROM member ORDER BY member_name ASC;
SELECT member_name FROM member ORDER BY member_name DESC;

# [문제] member테이블에서 회원 아이디 조회하기
# [조건] 회원 아이디를 기준으로 정렬
SELECT member_id FROM member;
SELECT member_id FROM member ORDER BY member_id ASC;
SELECT member_id FROM member ORDER BY member_id DESC;


/*
    정렬 기준이 2개 이상 일 때
*/
# [문제] book테이블에서 도서종류(book_kind), 도서명(book_title) 조회하기
# [조건] 
# 도서 종류(book_kind)를 기준으로 먼저 정렬한 뒤,
# 같은 종류(book_kind) 내에서는 도서명(book_title)을 기준으로 오름차순 정렬
SELECT book_kind, book_title FROM book;
SELECT book_kind, book_title FROM book ORDER BY book_kind, book_title;
SELECT book_kind, book_title FROM book ORDER BY book_kind ASC, book_title ASC;

# [문제] member테이블에서 회원성별(member_gender), 회원이름(member_name) 조회하기
# [조건] 
# 회원 성별(member_gender)을 기준으로 오름차순 정렬한 뒤,
# 같은 성별(member_gender) 내에서는 회원 이름(member_name)을 기준으로  내림정렬
SELECT member_gender, member_name FROM member;
SELECT member_gender, member_name FROM member ORDER BY member_gender, member_name DESC;
SELECT member_gender, member_name FROM member ORDER BY member_gender ASC, member_name DESC;



# [문제] book테이블에서 도서명과 출판일 가져오기
# [조건] 출판일을 기준으로 정렬

# [문제] member테이블에서 회원이름 조회하기
# [조건] 회원이름을 기준으로 정렬

# [문제] member테이블에서 회원 아이디 조회하기
# [조건] 회원 아이디를 기준으로 정렬

# [문제] book테이블에서 도서종류(book_kind), 도서명(book_title) 조회하기
# [조건] 
# 도서 종류(book_kind)를 기준으로 먼저 정렬한 뒤,
# 같은 종류(book_kind) 내에서는 도서명(book_title)을 기준으로 오름차순 정렬

# [문제] member테이블에서 회원성별(member_gender), 회원이름(member_name) 조회하기
# [조건] 
# 회원 성별(member_gender)을 기준으로 오름차순 정렬한 뒤,
# 같은 성별(member_gender) 내에서는 회원 이름(member_name)을 기준으로  내림정렬