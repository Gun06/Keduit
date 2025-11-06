
-- CASE문을 이용하여 성별 코드를 남성/여성으로 변환하시오.
SELECT 
    member_id,
    member_name,
    CASE member_gender 
        WHEN 'm' THEN '남성'
        WHEN 'w' THEN '여성'
        ELSE '기타'
    END AS gender_label
FROM member;

-- CASE문을 이용하여 도서 재고 상태를으로 구분하시오.
SELECT 
    book_title,
    book_count,
    CASE 
        WHEN book_count = 0 THEN '품절'
        WHEN book_count < 10 THEN '재고 부족'
        ELSE '재고 충분'
    END AS stock_status
FROM book;


--CASE문을 이용하여 도서 가격대별 등급을 구분하시오.
SELECT 
    book_title,
    book_price,
    CASE 
        WHEN book_price < 15000 THEN '저가'
        WHEN book_price BETWEEN 15000 AND 25000 THEN '중가'
        ELSE '고가'
    END AS price_grade
FROM book;


-- CASE문을 이용하여 도서 할인율에 따라 판매 상태를 구분하시오.
SELECT 
    book_title,
    book_discount_rate,
    CASE 
        WHEN book_discount_rate = 0 THEN '정가 판매'
        WHEN book_discount_rate BETWEEN 1 AND 9 THEN '소폭 할인'
        WHEN book_discount_rate BETWEEN 10 AND 19 THEN '10% 이상 할인'
        WHEN book_discount_rate >= 20 THEN '대폭 할인'
        ELSE '기타'
    END AS discount_label
FROM book;


-- 출간 연도를 기준으로 도서의 발행 상태를 CASE문으로 구분하시오.
SELECT 
    book_title,
    YEAR(book_publishing_date) AS pub_year,
    CASE 
        WHEN YEAR(book_publishing_date) < 2015 THEN '구간(Old Edition)'
        WHEN YEAR(book_publishing_date) BETWEEN 2015 AND 2018 THEN '보통(중간 연도)'
        WHEN YEAR(book_publishing_date) >= 2019 THEN '신간(New Arrival)'
    END AS pub_status
FROM book;


--회원 가입일을 기준으로 회원 등급(오래된 회원/중간 회원/신규 회원)을 CASE문으로 구분하시오.
SELECT 
    member_name,
    member_reg_date,
    CASE 
        WHEN member_reg_date < '2019-01-01' THEN '오래된 회원'
        WHEN member_reg_date BETWEEN '2019-01-01' AND '2021-01-01' THEN '중간 회원'
        ELSE '신규 회원'
    END AS member_grade
FROM member;


