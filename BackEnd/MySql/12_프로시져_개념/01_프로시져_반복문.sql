-- 스토어드 프로시저란 마치 함수와 똑같다.
-- 함수처럼 미리 만들어 놓고, 재활용 가능하다.

DELIMITER $$
CREATE PROCEDURE doit_while (param_1 INT, param_2 INT)
BEGIN
    -- 변수 선언
	DECLARE i INT;
	DECLARE while_sum INT;
	
    -- 변수 값 저장
	SET i = 1;
	SET while_sum = 0;
	
    -- 반복문
	WHILE (i <= param_1) DO
		SET while_sum = while_sum + param_2;
		SET i = i + 1;
	END WHILE;
	
	SELECT while_sum;
END $$
DELIMITER ;

-- 스토어드 프로시저 실행
-- 함수처럼 실행한다.
CALL doit_while(10, 3);

-- 삭제
DROP PROCEDURE IF EXISTS doit_while;
