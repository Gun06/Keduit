/*
    [transaction]
        데이터베이스는 한번에 한동작만 할수있다. 
        은행 송금과같이 두가지 동작이 필요한경우에 오류가 발생한다면, 
        원래 상태로 되돌리는 기능이 필요하다.
        그때 트랜젝션을 사용한다. 

        [1] START TRANSACTION; 을 통해 시작지점을 설정한다. 

        [2-1] ROLLBACK; 을 사용하는경우 
                START TRANSACTION; 이후 작성한 모든 명령어는 무효가된다. 

        [2-2] COMMIT; 을 사용하면 작성한 모든명령어는 정상적으로 동작하며, 
                START TRANSACTION; 지점은 삭제된다. 
*/

CREATE DATABASE transactiontest;

USE transactiontest;

# DECIMAL(자리소, 소수점자리수)
--  예) DECIMAL(19, 4) = 총 19자리까지 표현되며, 소수점은 4자리까지 표현
CREATE TABLE account(
	id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    amount DECIMAL(19, 4) NOT NULL
);

CREATE TABLE transferHistory(
	id INT AUTO_INCREMENT PRIMARY KEY,
    from_id INT NOT NULL,
    to_id INT NOT NULL,
    amount DECIMAL(19, 4) NOT NULL,
    trans_date DATETIME
);

INSERT INTO account(name, amount) VALUES('김철수', 1000000);
INSERT INTO account(name, amount) VALUES('박영희', 90000);

SELECT * FROM account;
SELECT * FROM transferHistory;


# START TRANSACTION = 트랜잭션 기능 사용

-- (1) ROLLBACK = START TRANSACTION부터 ROLLBACK까지 전부 취소된다.
-- (2) COMMIT = START TRANSATION부터 COMMIT까지 전부 실행된다.

START TRANSACTION;
-- 철수의 잔액 - 500,000
UPDATE account SET amount = amount - 500000 WHERE id = 1;
-- 영희의 잔액 + 500,000
UPDATE account SET amount = amount + 500000 WHERE id = 2;

SELECT * FROM account;

INSERT INTO transferHistory (from_id, to_id, amount, trans_date)
VALUES(1, 2, 500000, now());

SELECT * FROM transferHistory;

-- 롤백을 하고 출력해본다.
ROLLBACK;
SELECT * FROM account;
SELECT * FROM transferHistory;

-- 커밋을 하고 출력해본다. 
COMMIT;
SELECT * FROM account;
SELECT * FROM transferHistory;