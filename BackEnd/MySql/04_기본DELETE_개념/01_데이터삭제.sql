/*
	[데이터 삭제1]
    -----------------------------------------------------------
    DELETE FROM 테이블이름
    WHERE 컬럼=조건;
    -----------------------------------------------------------
    - UPDATE문과 동일하게 WHERE문의 조건이 누락되면 전체 데이터를 삭제하므로 주의해야 한다.
*/

CREATE DATABASE hellosql;
USE hellosql;
CREATE TABLE delete_table (
	num INT,					-- 숫자형
    info VARCHAR(50)			-- 문자형
);
INSERT INTO delete_table VALUES (1, '데이터 삽입1');
INSERT INTO delete_table VALUES (2, '데이터 삽입2');
INSERT INTO delete_table VALUES (3, '데이터 삽입3');

-- DELETE 문으로 데이터 삭제
DELETE FROM delete_table
WHERE num = 1;
SELECT * FROM delete_table;

-- DELETE 문으로 전체 데이터 삭제
DELETE FROM delete_table;
SELECT * FROM delete_table;

/*
    [데이터 삭제2]
    -----------------------------------------------------------
    TRUNCATE TABLE 테이블이름;
    -----------------------------------------------------------
    - 대량의 데이터를 삭제할 때 DELETE문을 사용하면 느랜잭션 로그 기록으로 인해
      데이터베이스 성능에 많은 문제가 발생할 수 있다.
    - 롤백(rollback) 즉, 이전 상태로 되돌리지 않는다는 가정하에 테이블이 전제 데이터를
      빠르게 삭제하려면 TRUNCATE문을 사용할 수 있다.
    - 롤백이 안 된다는 점에 다시 한번 주의하자.
*/