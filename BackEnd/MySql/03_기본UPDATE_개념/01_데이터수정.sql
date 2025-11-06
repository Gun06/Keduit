/*
	[데이터 수정]
    -----------------------------------------------------------
    UPDATE 테이블 SET [컬럼1=값1, 컬럼2=값2, ...]
    WHERE 컬럼=조건;
    -----------------------------------------------------------
    - UPDATE문에서 WHERE문을 생략할 수 있지만, 전체 테이블을 수정하므로 주의해야 한다.
*/

CREATE DATABASE hellosql;
USE hellosql;
CREATE TABLE update_table (
	num INT,					-- 숫자형
    info VARCHAR(50)			-- 문자형
);
INSERT INTO update_table VALUES (1, '데이터 삽입1');
INSERT INTO update_table VALUES (2, '데이터 삽입2');
INSERT INTO update_table VALUES (3, '데이터 삽입3');

-- UPDATE 명령어를 실행하기 위해서는 안전 모드를 비활성화 시켜야 한다.
-- [참고 이미지] 04_안전모드비활성화.png
UPDATE update_table SET info = '데이터 수정1'
WHERE num = 1;
SELECT * FROM update_table;

-- UPDATE 문으로 테이블 전체 데이터 수정
UPDATE update_table set num = num + 10;
SELECT * FROM update_table;