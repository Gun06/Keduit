/*
    [문자형]
    - 문자형은 크게 고정 길이와 가변 길이로 구분할 수 있다.
    - 고정 길이는 실제 값을 입력하지 않아도 지정한 만큼 저장 공간을 사용하며,
    - 가변 길이는 실제 입력한 값의 크기만큼만 저장 공간을 사용한다.
    - 문자열 데이터의 길이가 항상 고정이라면(예를 들어 주민등록번호나 전화번호) CHAR를 사용하고,
    - 글자 길이를 예측할 수 없지만 최대 글자 수를 예측할 수 있을 때에는 VARCHAR를 사용한다.

    - 종류
        데이터 유형    데이터 크기(byte)     설명
        CHAR(n)        1 ~ 255              고정 길이 문자열로, 0 ~ 255 크기의 문자열까지 저장 가능
        VARCHAR(n)     1 ~ 65535            가변 길이 문자열로, n만큼의 크기를 지정.
                                            0 ~ 16383 크기의 문자열까지 저장 가능
        BINARY(n)      1 ~ 255              고정 길이 문자열로, 0 ~ 255 크기의 문자열까지 저장 가능
        VARBINARY(n)   1 ~ 65535            가변 길이 문자열로, 0 ~ 16383 크기의 문자열까지 저장 가능
*/

/*
    - MySQL에서는 CHAR 또는 VARCHAR 뒤에 나오는 숫자는 바이트가 아닌 문자열의 문자 수이다.
*/
USE doitsql;

CREATE TABLE doit_char_varchar (
col_1 CHAR(5),
col_2 VARCHAR(5)
);

INSERT INTO doit_char_varchar VALUES ('12345', '12345');
INSERT INTO doit_char_varchar VALUES ('ABCDE', 'ABCDE');
INSERT INTO doit_char_varchar VALUES ('가나다라마', '가나다라마');
INSERT INTO doit_char_varchar VALUES ('hello', '안녕하세요');
INSERT INTO doit_char_varchar VALUES ('安寧安寧安', '安寧安寧安');

SELECT
	col_1, 
	CHAR_LENGTH(col_1) as char_length, 
	LENGTH(col_1) AS char_byte,col_2, 
	CHAR_LENGTH(col_2) as char_length, 
	LENGTH(col_2) AS char_byte
FROM doit_char_varchar;