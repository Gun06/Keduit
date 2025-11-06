/*
    [문자열 함수]
    - 자바와 달리 문자열 인덱스의 시작값은 1이다.
*/

/*
    [문자열과 문자열을 연결하는 함수]
    CONCAT('문자', '문자', ...)
*/
# 'MySQL연습'
SELECT CONCAT('MySQL', '연습');

/*
    CONCAT_WS('구분자', '문자', '문자', ...)
*/
# 'MySQL:연습'
SELECT CONCAT_WS(':', 'MySQL', '연습');

# 구분자 문자를 NULL을 입력할 경우 결과는 모두 NULL이 반환된다.
# NULL
SELECT CONCAT_WS(NULL, 'MySQL', '연습');

# 구분자 인수 뒤에 오는 NULL은 무시하여 건너뛴다.
SELECT CONCAT_WS(':', 'MySQL', NULL, '연습');


/*
    [데이터 형 변환 함수]
    CAST(컬럼 AS 데이터유형)
    CONVERT(컬럼, 데이터유형)

    [CAST 및 CONVERT에 사용 가능한 데이터 유형]
    BINARY                  CHAR
    DATE                    DATETIME
    TIME                    DECIMAL
    JSON                    NCHAR
    SIGNED[INTEGER]         UNSIGNED[INTEGER]
*/
# CAST함수로 문자열을 부호 없는 정수형으로 변경
SELECT
    4 / '2',							# 2
    4 / 2,								# 2.0000
    4 / CAST('2' AS UNSIGNED);			# 2.0000

# CAST함수로 날짜형 데이터를 숫자형으로 변환
# 20251025184607
SELECT CAST(NOW() as UNSIGNED);

# CAST함수로 숫자형을 날짜형으로 변환
# '2025-10-25'
SELECT CAST(20251025 AS DATE);

# CAST함수로 숫자형을 문자열로 변환
# '20251025'
# 결과에 변화는 없지만 데이터 유형이 문자형으로 변경됨
SELECT CAST(20251025 AS CHAR);
# 문자열 길이를 지정하면 문자열을 변환할 때 지정한 값보다 문자열 길이가 작으면 물자열이 잘림
# '2025'
SELECT CAST(20251025 AS CHAR(4));

# CONVERT함수로 날짜형을 정수형으로 변환
# '20251025203722'
SELECT CONVERT(NOW(), SIGNED);

# CONVERT함수로 숫자형을 날짜형으로 변환
# '2025-10-25'
SELECT CONVERT(20251025, DATE);

# CONVERT함수로 숫자형을 문자열로 변환
#'20251025'
SELECT CONVERT(20251025, CHAR);
# '2025'
SELECT CONVERT(20251025, CHAR(4));



/*
    오버플로(OVERFLOW)
    - 오버플로란 일반적인 의미는 '넘쳐흐르다'라는 뜻으로,
    - 컴퓨터에서 오버플로는 데이터 유형에 따른 한계 값을 넘었다는 뜻이다.
*/
# 실행하면 가장 큰 숫자형(BIGINT)의 범위를 넘어 오버플로가 발생한다.
# Error Code: 1690. BIGINT value is out of range in '(9223372036854775807 + 1)'
SELECT 9223372036854775807 + 1;

# 이런 오버플로를 예방하고 싶다면 CAST나 CONVERT 함수를 활용해 입력값을 UNSIGNED로 변경하여 연산하면 된다.
# 9223372036854775808
SELECT CAST(9223372036854775807 AS UNSIGNED) + 1;
SELECT CONVERT(9223372036854775807, UNSIGNED) + 1;



/*
    [문자열 일부를 다른 문자열로 대체하는 함수]
    INSERT('원본문자열', 시작위치, 삭제할길이, '삽입할문자열')
    - 지정한 위치에서 일정 길이만큼 삭제한 후 새 문자열을 삽입한다.
*/
# INSERT() : 2번째부터 3개를 삭제한 후, 삽입
SELECT INSERT('abcde', 2, 3, 'bbb');	# abbbe
# INSERT() : 2번째부터 삽입
SELECT INSERT('aaaa', 2, 0, 'bbb');		# abbbaaa


/*
    [문자열 내에서 특정 문자열의 위치를 찾는 함수]
    INSTR('전체문자열', '찾을문자열')
    - 찾을 문자열이 있으면 해당 문자열이 시작되는 위치(인덱스 번호)를 반환한다.
    - 찾을 문자열이 없으면 0을 반환한다.
*/
# INSTR() : '하세'라는 문자열이 있으면 해당 문자열의 시작 위치(=인덱스)
SELECT INSTR('안녕하세요', '하세');			# 3
# INSTR() : 해당 문자열이 없으면 0
SELECT INSTR('안녕하세요', '방갑');			# 0



/*
    [소문자 혹은 대문자로 변경하는 함수]
    LOWER(문자열)
    UPPER(문자열)
*/
SELECT 'Hello, MySQL', LOWER('Hello, MySQL'), UPPER('Hello, MySQL');



/*
    [공백을 제거하는 함수]
    LTRIM(문자열)
    RTRIM(문자열)
    TRIM(문자열)

    - 공백은 데이터 관리자에게는 문제를 일으킬 수 있으므로 관리 대상이다.
    - LTRIM 함수의 L은 왼쪽을, RTRIM함수의 R은 오른쪽을 의미하며 
      각각 문자열의 왼쪽(앞) 또는 오른쪽(뒤)의 공백을 제거한다.
    - TRIM 함수는 양쪽 공백을 모두 제거한다.
*/
SELECT CONCAT('[', LTRIM('       Hello, MySQL'), ']');
SELECT CONCAT('[', RTRIM('Hello, MySQL       '), ']');
SELECT CONCAT('[', TRIM('       Hello, MySQL       '), ']');

/*
    - TRIM 함수는 특정 문자를 제거하는 기능도 있다.
*/
# 왼쪽 # 제거
SELECT CONCAT('[', TRIM(LEADING '#' FROM '#       Hello, MySQL       #'), ']');
# 오른쪽 # 제거
SELECT CONCAT('[', TRIM(TRAILING '#' FROM '#       Hello, MySQL       #'), ']');
# 양쪽 # 제거
SELECT CONCAT('[', TRIM(BOTH '#' FROM '#       Hello, MySQL       #'), ']');


/*
    [문자열 크기를 반환하는 함수]
    LENGTH(문자열)

    [문자열 개수를 반환하는 함수]
    CHAR_LENGTH(문자열)
*/
# 영어 및 공백은 1byte
# 한글과 한자, 특수문자는 3byte
SELECT LENGTH('A'), LENGTH('가'), LENGTH('漢'), LENGTH('★'), LENGTH(' ');
SELECT LENGTH('MySQL Class'), LENGTH('데이터베이스 수업');

# 문자열의 개수 반환
SELECT CHAR_LENGTH('MySQL Class'), CHAR_LENGTH('데이터베이스 수업');



/*
    [특정 문자까지의 문자열 길이를 반환하는 함수]
    POSITION('검색문자열' IN '문자열')
*/
# 6
SELECT POSITION('!' IN 'Hello! MySQL!!');

# 검색 문자가 존재하지 않으면 0을 반환
# 0
SELECT POSITION('#' IN 'Hello! MySQL!!');


/*
    [지정한 길이만큼 문자열을 반환하는 함수]
    LEFT('문자열', 문자개수) : 왼쪽에서 지정한 개수만큼 반환
    RIGHT('문자열', 문자개수) : 오른쪽에서 지정한 개수만큼 반환
    MID('문자열', 시작위치, 문자개수) : 지정한 위치부터 지정한 개수만큼 반환
*/
# 'Hello', 'MySQL'
SELECT LEFT('Hello, MySQL', 5), RIGHT('Hello, MySQL', 5);

# LEFT() : 왼쪽에서부터 3개의 문자 반환
SELECT LEFT('abcdef', 3);				# abc
# RIGHT() : 오른쪽에서부터 3개의 문자 반환
SELECT RIGHT('abcdef', 3);				# def
# MID() : 2번째에서부터 3개의 문자 반환
SELECT MID('abcdefg', 2, 3);			# bcd



/*
    [지정한 범위의 문자열을 반환하는 함수]
    SUBSTRING('문자열', 시작위치, 반환할문자열개수)
*/
# 8번째 문자부터 문자 2개를 반환
# 'My'
SELECT SUBSTRING('Hello, MySQL', 8, 2);

/*
    SUBSTRING과 POSITION 함수 조합
*/
# 'hello'
SELECT SUBSTRING('hello@email.com', 1, 5);
# 5
SELECT POSITION('@' IN 'hello@email.com') - 1;
# 'hello'
SELECT SUBSTRING('hello@email.com', 1, POSITION('@' IN 'hello@email.com') - 1);


/*
    [특정 문자를 다른 문자로 대체하는 함수]
    REPLACE('원본문자열', '검색어', '대체어')
*/
# 'Hello, Oracle'
SELECT REPLACE('Hello, MySQL', 'MySQL', 'Oracle');



/*
    [문자를 반복하는 함수]
    REPEAT('반복할문자', 횟수)
*/
# 'hahaha'
SELECT REPEAT('ha', 3);


/*
    [공백 문자를 생성하는 함수]
    SPACE(공백횟수)
*/
# '홍     길동'
SELECT CONCAT('홍', SPACE(5), '길동');



/*
    [문자열을 역순으로 출력하는 함수]
    REVERSE('문자열')
*/
# 'hello'
SELECT REVERSE('olleh');

# IP 주소의 3번째 부분까지 정보만 조회
# '1.0.861.291'
SELECT REVERSE('192.168.0.1');
# 11
SELECT CHAR_LENGTH('192.168.0.1');
# 2
SELECT POSITION('.' IN REVERSE('192.168.0.1'));
# '192.168.0'
SELECT SUBSTRING('192.168.0.1', 1, 11 - 2);
SELECT SUBSTRING('192.168.0.1', 1, CHAR_LENGTH('192.168.0.1') - POSITION('.' IN REVERSE('192.168.0.1')));


/*
    [문자열을 비교하는 함수]
    STRCMP('비교문자열1', '비교문자열2')
    
    - 두 문자열을 비교하여 결과를 정수로 반환하는 함수이다.
    - 반환 값               의미
        0                   두 문자열이 같다
        1                   1번이 2번보다 크다
        -1                  1번이 2번보다 작다
*/
# 0
SELECT STRCMP('hello', 'hello');
SELECT STRCMP('hello', 'HELLO');
# 1
SELECT STRCMP('hello', 'dello');
# -1
SELECT STRCMP('hello', 'zello');