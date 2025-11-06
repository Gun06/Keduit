/*
	[집계 함수]
    - 집계 함수는 데이터를 그룹화해 계산할 때 자주 사용한다.
*/

USE db1_book_store;

SHOW TABLES;

DESC book;
DESC cart;
DESC member;

SELECT * FROM book;
SELECT * FROM cart;
SELECT * FROM member;

/*
	[조건에 맞는 데이터 개수를 세는 함수]
    COUNT(컬럼)
*/
# [문제] member테이블에서 전체 회원 수 조회
SELECT COUNT(*) FROM member;

# [문제] book테이블에서 전체 도서 수 조회
SELECT COUNT(*) FROM book;

# [문제] member테이블에서 남자 회원 수 조회
SELECT COUNT(*) 
FROM member 
WHERE member_gender='m';

# [문제] book테이블에서 '한빛미디어' 출판사에서 출간한 도서 수 조회
SELECT COUNT(*)
FROM book
WHERE book_publishing_com = '한빛미디어';

# [문제] cart테이블에서 중복을 제거한 회원 수 조회
SELECT DISTINCT buyer FROM cart;
SELECT COUNT(DISTINCT buyer) FROM cart;


# [문제] member테이블에서 전체 회원 수 조회
# [문제] book테이블에서 전체 도서 수 조회
# [문제] member테이블에서 남자 회원 수 조회
# [문제] book테이블에서 '한빛미디어' 출판사에서 출간한 도서 수 조회
# [문제] cart테이블에서 중복을 제거한 회원 수 조회



/*
    [데이터의 합을 구하는 함수]
    SUM(컬럼)
*/
# [문제] book테이블에서 전체 도서 가격의 총합 조회
SELECT SUM(book_price) FROM book;

# [문제] book테이블에서 도서 가격을 10%로 인상했을 때의 총합 조회
SELECT SUM(book_price), SUM(book_price*1.1) FROM book;

# [문제] cart테이블에서 도서 총 판매 금액 조회
SELECT SUM(buy_price * buy_count) FROM cart;


# [문제] book테이블에서 전체 도서 가격의 총합 조회
# [문제] book테이블에서 도서 가격을 10%로 인상했을 때의 총합 조회
# [문제] cart테이블에서 도서 총 판매 금액 조회


/*
    [데이터의 평균을 구하는 함수]
    AVG(컬럼)
*/
# [문제] book테이블에서 전체 도서 가격의 평균 조회
# [조건] 소수점 이하 2자리까지 출력
SELECT AVG(book_price) FROM book;
SELECT ROUND(AVG(book_price), 2) FROM book;



# [문제] book테이블에서 전체 도서 가격의 평균 조회
# [조건] 소수점 이하 2자리까지 출력



/*
    [최솟값을 구하는 함수]
    MIN(컬럼)

    [최댓값을 구하는 함수]
    MAX(컬럼)
*/
# [문제] book테이블에서 도서 가격이 가장 높은 도서가격 조회
SELECT MAX(book_price) FROM book;

# [문제] book테이블에서 가장 최근에 등록된 도서 등록 날짜 조회
SELECT MAX(book_reg_date) FROM book;

# [문제] book테이블에서 도서 가격이 가장 낮은 도서가격 조회
SELECT MIN(book_price) FROM book;


# [문제] book테이블에서 도서 가격이 가장 높은 도서가격 조회
# [문제] book테이블에서 가장 최근에 등록된 도서 등록 날짜 조회
# [문제] book테이블에서 도서 가격이 가장 낮은 도서가격 조회

