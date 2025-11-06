/*
    [정규 표현식으로 더 다양하게 데이터 조회하기]
    - MySQL에서는 정규 표현식(regular expression)을 의미하는 REGEXP으로 문자열을 검색할 수 있다.
    - 정규 표현식은 특정한 패턴의 문자열을 표현하기 위해 사용한다.
    - 다음은 MySQL에서 지원하는 정규 표현식이다.
    -----------------------------------------------------------
        .       : 줄 바꿈 문자(\n)를 제외한 임의의 한 문자를 의미
        *       : 해당 문자 패턴이 0번 이상 반복
        +       : 해당 문자 패턴이 1번 이상 반복
        ^       : 문자열을 처음을 의미 
        $       : 문자열의 끝을 의미
        |       : OR를 의미
        [...]   : 대괄호 안에 있는 어떠한 문자를 의미
        [^...]  : 대괄호 안에 있지 않은 어떠한 문자를 의미
        {n}     : 반복되는 횟수를 지정
        {m, n}  : 반복되는 횟수의 최솟값과 최댓값을 지정
    -----------------------------------------------------------
*/

INSERT INTO member VALUES(6, 'qwek', '1234', '하하', 'm', 0, now());
INSERT INTO member VALUES(7, 'qqqq', '1234', 'test', 'w', 0, now());
INSERT INTO member VALUES(8, 'abcdef', '1234', 'hello', 'w', 0, now());
INSERT INTO member VALUES(9, 'abc', '1234', 'moana', 'm', 0, now());
INSERT INTO member VALUES(10, 'cxdz', '1234', '민김설', 'm', 0, now());
INSERT INTO member VALUES(11, '1234', '1234', '수성구', 'm', 0, now());



# [문제] member테이블에서 회원아이디(member_id)가 'qwe'로 시작하고, 
#        마지막에 어떤 글자든 한 글자가 포함된 네 글자짜리 아이디 조회
SELECT * FROM member WHERE member_id REGEXP 'qwe.';

# [문제] member테이블에서 회원아이디(member_id)가 'q'로 시작하고,
#        다음 q는 0회 이상 반복하는 아이디 조회
SELECT * FROM member WHERE member_id REGEXP 'qq*';

# [문제] member테이블에서 회원아이디(member_id)가 'q'로 시작하고,
#        다음 q는 1회 이상 반복하는 아이디 조회
SELECT * FROM member WHERE member_id REGEXP 'qq+';

# [문제] member테이블에서 회원이름(member_name)이 김으로 시작하는 회원정보 조회
SELECT * FROM member WHERE member_name REGEXP '^김';
SELECT * FROM member WHERE member_name REGEXP '김';

# [문제] member테이블에서 여성 회원 중에 이름에 신이 포함된 회원정보 조회
SELECT * FROM member WHERE member_gender = 'w' AND member_name REGEXP '신';

# [문제] book테이블에서 도서 분류 코드(book_kind)가 3으로 시작하는 도서 정보 조회
SELECT * FROM book WHERE book_kind REGEXP '^3';

# [문제] book테이블에서 도서명(book_title)이 혼자 공부하는 으로 시작하는 도서 정보 조회
SELECT * FROM book WHERE book_title REGEXP '^혼자 공부하는.+';

# [문제] book테이블에서 도서명(book_title)이 외국어로 끝나는 도서 정보 조회
SELECT * FROM book WHERE book_title REGEXP '외국어$';

# [문제] member테이블에서 회원아이디(member_id)가 영문 소문자로 4글자 이상인 회원정보 조회
SELECT * FROM member WHERE member_id REGEXP '[a-z]{4}';

# [문제] member테이블에서  회원아이디(member_id)가 소문자 알파벳이 아닌 문자로 4글자 이상인 회원정보 조회
SELECT * FROM member WHERE member_id REGEXP '[^a-z]{4}';

# [문제] book테이블에서 도서명(book_title)의 길이가 5 ~ 10 글자 사이이고 한국어 이면서 공백이 포함된 도서 정보 조회
# [주의] 한글은 띄어쓰기가 있기 때문에, 공백을 포함시킨 정규식을 작성해야 한다.
#        즉, [가-힣 (공백)] 뒤에 공백 한 칸이 있어야 한다.
SELECT * FROM book WHERE book_title REGEXP '^[가-힣 ]{5,10}$';