# 데이터 베이스 사용하기
USE db1_book_store;

SHOW tables;

DESC member;
DESC book;
DESC cart;

# 컬럼 전부 조회하기
SELECT * FROM member;
SELECT * FROM book;
SELECT * FROM cart;

# WEHRE : 자바에서의 if문과 같다
# 1) SELECT
# 2) FROM
# 3) WHERE

# 비교 연산자
#  = 같다(주의)
#  > 크다
#  < 작다
#  >= 크거나 같다
#  <= 작거나 같다
#  <> 다르다(주의)

# 논리연산자 ( 두 개 이상의 조건문을 작성할 때 사용 )
# AND
# OR
# NOT
# BETWEEN A AND B
# IN
# 연산자 우선순위에 의해 AND가 OR보다 더 우선 실행된다.

# [문제] member테이블에서 id가 qwer인 회원의 이름과 비밀번호 조회하기
SELECT member_name, member_pw FROM member 
WHERE member_id = 'qwer';

# [문제] member테이블에서 name이 신혜정보다 뒤에 위치한 이름 조회하기
SELECT member_name FROM member
WHERE member_name > '신혜정';

# [문제] member테이블에서 id가 m과 s사이의 데이터를 조회하기
SELECT member_id FROM member
WHERE member_id BETWEEN 'm' AND 's';

# [문제] member테이블에서 id가 m과 s 범위의 값을 제외한 조회하기
SELECT member_id FROM member
WHERE member_id NOT BETWEEN 'm' AND 's';

# [문제] book테이블에서 book_kind가 문학(100)인 책정보 조회하기
SELECT * FROM book WHERE book_kind = '100';

# [문제] book테이블에서 가격이 15,000원 이하인 책정보 조회하기
SELECT * FROM book WHERE book_price <= 15000;

# [문제] book테이블에서 문학(100)이 아닌 책정보만 조회하기
SELECT * FROM book WHERE book_kind <> '100';

# [문제] book테이블에서 2020년 이전에 등록된 책정보만 조회하기
SELECT * FROM book WHERE book_reg_date < '2020-01-01';

# [문제] book테이블에서 컴퓨터(300)이면서 가격이 15,000원 이상인 책정보 조회하기
SELECT * FROM book WHERE book_kind = '300' AND book_price >= 15000;

# [문제] book테이블에서 재고가 없는 책정보 조회하기
# [주의] 같다는 =이 하나이다!
SELECT * FROM book WHERE book_count = 0;

# [문제] book테이블에서 문학(100)이거나 컴퓨터(300)인 책정보 조회하기
SELECT * FROM book WHERE book_kind = '100' OR book_kind = '300';

# [문제] book테이블에서 할인률이 없는 책정보 조회하기
SELECT * FROM book WHERE book_discount_rate = 0;

# [문제] book테이블에서 할인률이 있는 책정보 조회하기
SELECT * FROM book WHERE NOT book_discount_rate = 0;

# [문제] book테이블에서 도서 재고 수량이 10개 이상이고 20개 이하인 책정보 조회하기
SELECT * FROM book WHERE book_count BETWEEN 10 AND 20;

# [문제] book테이블에서 도서 등록일이 '2014-02-08' 부터 '2014-11-22' 인 책 정보 조회하기
SELECT * FROM book WHERE book_reg_date BETWEEN '2014-02-08' AND '2014-11-22';

# [문제] book테이블에서 도서 할인율이 0 또는 5 또는 10인 책 정보 조회하기
SELECT book_title, book_discount_rate FROM book
WHERE book_discount_rate = 0 OR book_discount_rate = 5 OR book_discount_rate = 10;

/*
	- OR를 두 개 이상 사용하는 경우 OR를 반복하여 쓰기 보단 IN을 사용해 보자.
    - IN은 OR와 같은 역할을 하지만 연산자를 한 개만 작성하고, 쉼표를 사용해 조건을 나열한다.
*/
SELECT book_title, book_discount_rate FROM book
WHERE book_discount_rate IN (0, 5, 10);

# [문제] book_kind가 100 또는 300 이면서 book_discount_rate가 20인 데이터 조회하기
# 잘못된 예시
SELECT book_kind, book_title, book_discount_rate FROM book
WHERE book_kind = 100 OR book_kind = 300 AND book_discount_rate = 20;

SELECT book_kind, book_title, book_discount_rate FROM book
WHERE (book_kind = 100 OR book_kind = 300) AND book_discount_rate = 20;


# [문제] member테이블에서 id가 qwer인 회원의 이름과 비밀번호 조회하기
# [문제] member테이블에서 name이 신혜정보다 뒤에 위치한 이름 조회하기
# [문제] member테이블에서 id가 m과 s사이의 데이터를 조회하기
# [문제] member테이블에서 id가 m과 s 범위의 값을 제외한 조회하기
# [문제] book테이블에서 book_kind가 문학(100)인 책정보 조회하기
# [문제] book테이블에서 가격이 15,000원 이하인 책정보 조회하기
# [문제] book테이블에서 문학(100)이 아닌 책정보만 조회하기
# [문제] book테이블에서 2020년 이전에 등록된 책정보만 조회하기
# [문제] book테이블에서 컴퓨터(300)이면서 가격이 15,000원 이상인 책정보 조회하기
# [문제] book테이블에서 재고가 없는 책정보 조회하기
# [문제] book테이블에서 문학(100)이거나 컴퓨터(300)인 책정보 조회하기
# [문제] book테이블에서 할인률이 없는 책정보 조회하기
# [문제] book테이블에서 할인률이 있는 책정보 조회하기
# [문제] book테이블에서 도서 재고 수량이 10개 이상이고 20개 이하인 책정보 조회하기
# [문제] book테이블에서 도서 등록일이 '2014-02-08' 부터 '2014-11-22' 인 책 정보 조회하기
# [문제] book테이블에서 도서 할인율이 0 또는 5 또는 10인 책 정보 조회하기
# [문제] book_kind가 100 또는 300 이면서 book_discount_rate가 20인 데이터 조회하기