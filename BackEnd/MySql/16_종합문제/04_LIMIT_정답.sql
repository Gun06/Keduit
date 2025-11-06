/*
	[LIMIT으로 상위 데이터 조회하기]
    -----------------------------------------------------------
    SELECT 컬럼 
    FROM 테이블
    WHERE 컬럼 = 조건
    ORDER BY 컬럼 [ASC 또는 DESC]
    LIMIT 숫자;
    -----------------------------------------------------------
    - 데이터 중에서 상위 N개의 데이터만 보고 싶은 경우에 사용한다.
*/

# [문제] book테이블에서 상위 10개의 책 정보 조회하기
# [조건] 도서번호(book_no)를 기준으로 정렬
SELECT * FROM book;
SELECT * FROM book ORDER BY book_no ASC LIMIT 10;
SELECT * FROM book ORDER BY book_no DESC LIMIT 10;

# [문제] cart테이블에서 상위 3개의 장바구니 정보 조회하기
# [조건] 구매가격(buy_price)을 기준으로 내림차순 정렬
SELECT * FROM cart ORDER BY buy_price;
SELECT * FROM cart ORDER BY buy_price DESC LIMIT 3;


/*
	[LIMIT으로 범위를 지정해 데이터 조회하기]
    -----------------------------------------------------------
    SELECT 컬럼 
    FROM 테이블
    WHERE 컬럼 = 조건
    ORDER BY 컬럼 [ASC 또는 DESC]
    LIMIT 숫자1, 숫자2;
    -----------------------------------------------------------
    - 상위 숫자1 다음 행부터 숫자2 개의 행을 조회한다.
*/

# [문제] book테이블에서 상위 13번째부터 3개의 상품 조회
# [조건] 도서번호(book_no)를 기준으로 오름차순 정렬
SELECT * FROM book ORDER BY book_no ASC;
# 도서번호(book_no)를 기준으로 오름차순 정렬 후, 상위 12개의 상품 조회
SELECT * FROM book ORDER BY book_no ASC LIMIT 12;
# 도서번호(book_no)를 기준으로 오름차순 정렬 후, 13번째 부터 3개의 상품 조회
SELECT * FROM book ORDER BY book_no ASC LIMIT 12, 3;

/*
	[OFFSET으로 특정 구간의 데이터 조회하기]
    -----------------------------------------------------------
    SELECT 컬럼 
    FROM 테이블
    WHERE 컬럼 = 조건
    ORDER BY 컬럼 [ASC 또는 DESC]
    LIMIT 숫자1 OFFSET 숫자2;
    -----------------------------------------------------------
    - 숫자2 개를 건너뛰고 숫자2 다음 행부터 숫자1 개의 행을 조회한다.
*/
# [문제] book테이블에서 상위 12개의 상품을 건너뛰고 13번째부터 3개의 상품 조회
# [조건] 도서번호(book_no)를 기준으로 오름차순 정렬
SELECT * FROM book ORDER BY book_no ASC LIMIT 3 OFFSET 12;
# 위 문장과 동일한 결과가 출력된다.
SELECT * FROM book ORDER BY book_no ASC LIMIT 12, 3;



# [문제] book테이블에서 상위 10개의 책 정보 조회하기
# [조건] 도서번호(book_no)를 기준으로 정렬

# [문제] cart테이블에서 상위 3개의 장바구니 정보 조회하기
# [조건] 구매가격(buy_price)을 기준으로 내림차순 정렬

# [문제] book테이블에서 상위 13번째부터 3개의 상품 조회
# [조건] 도서번호(book_no)를 기준으로 오름차순 정렬

# [문제] book테이블에서 상위 12개의 상품을 건너뛰고 13번째부터 3개의 상품 조회
# [조건] 도서번호(book_no)를 기준으로 오름차순 정렬