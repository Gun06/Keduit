/*
    [와일드카드로 문자열 조회하기]
    -----------------------------------------------------------
    SELECT 컬럼 
    FROM 테이블
    WHERE 컬럼 LIKE 조건;
    -----------------------------------------------------------
    * MySQL은 알파벳 대소문자를 구분하지 않는다.
    - LIKE 연산자는 특정한 패턴(모양)을 가진 문자열을 찾을 때 사용한다.
    - 와일드카드(Wildcard)란, 임의의 문자를 대신 나타내는 기호로,
      검색 시 정확한 단어를 몰라도 비슷한 형태를 찾아주는 역할을 한다.
    - LIKE 에서는 다음 두 가지 와일드 카드를 자주 사용한다.
        - % 와일드카드  : 0개 이상의 문자(아무 글자나 여러 개 가능)
        - % 사용의 예)
            A%  : A로 시작하는 모든 문자열
            %A  : A로 끝나는 모든 문자열
            %A% : A가 포함된 모든 문자열
        - _ 와일드카드 : 정확히 1개의 문자
        - _ 사용의 예)
            A_     : A로 시작하는 두 글자의 문자열
            _A     : A로 끝나는 두 글자의 문자열
            _A_    : A가 가운데 있는 세 글자의 문자열
*/

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

# [문제] book테이블에서 책 제목(book_title)에 '자바'가 포함되어 있는 책정보 조회
SELECT * FROM book WHERE book_title LIKE '%자바%';
SELECT * FROM book WHERE book_title LIKE '%java%';
SELECT * FROM book WHERE book_title LIKE '%자바%' OR book_title LIKE '%java%';

# [문제] book테이블에서 책 제목(book_title)이 '나'로 시작되는 책정보 조회
SELECT * FROM book WHERE book_title LIKE '나%';

# [문제] book테이블에서 책 제목(book_title)이 '외국어'로 끝나는 책정보 조회
SELECT * FROM book WHERE book_title LIKE '%외국어';

# [문제] book 테이블에서 책 제목에(book_title) 외국어가 포함되지 않은 책정보 조회
SELECT * FROM book WHERE book_title LIKE '%외국어%';
SELECT * FROM book WHERE book_title NOT LIKE '%외국어%';

# [문제] member테이블에서 이름이 4글자인 회원정보 가져오기
SELECT * FROM member WHERE member_name LIKE '____';

# [문제] book테이블에서 책저자의 이름(book_author)이 정으로 시작하고 3글자인 이름 조회
SELECT book_title, book_author FROM book WHERE book_author LIKE '정__';


# [문제] book테이블에서 책 제목(book_title)에 '자바'가 포함되어 있는 책 정보 조회
# [문제] book테이블에서 책 제목(book_title)이 '나'로 시작되는 책정보 조회
# [문제] book테이블에서 책 제목(book_title)이 '외국어'로 끝나는 책정보 조회
# [문제] book 테이블에서 책 제목에(book_title) 외국어가 포함되지 않은 책정보 조회

# [문제] member테이블에서 이름이 4글자인 회원정보 가져오기
# [문제] book테이블에서 책저자의 이름(book_author)이 정으로 시작하고 3글자인 이름 조회