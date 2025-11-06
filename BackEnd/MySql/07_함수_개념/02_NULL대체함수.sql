/*
    [NULL을 대체하는 함수]
    IFNULL(컬럼, 대체할 값)
    COALESCE(컬럽1, 컬럼2, 컬럼3, ...)
*/
/*
    - NULL은 어떠한 연산 작업을 진행해도 NULL이 반환된다.
    - 때문에 NULL로 인해 예기치 못한 결과를 얻게 되는 경우가 종종 있다.
*/
SELECT 10 + NULL;
SELECT 10 - NULL;
SELECT 10 * NULL;
SELECT 10 / NULL;



CREATE DATABASE nullsql;

USE nullsql;

CREATE TABLE null_table (
	col_1 INT,
    col_2 VARCHAR(10),
    col_3 VARCHAR(10),
    col_4 VARCHAR(10),
    col_5 VARCHAR(10)
);

INSERT INTO null_table VALUES (1, NULL, 'col_3', 'col_4', 'col_5');
INSERT INTO null_table VALUES (2, NULL, NULL, NULL, 'col_5');
INSERT INTO null_table VALUES (3, NULL, NULL, NULL, NULL);
SELECT * FROM null_table;

# [문제] col_2 컬럼의 값이 NULL이면 IFNULL 함수를 사용해 공백('')으로 대체
SELECT col_1, IFNULL(col_2, ''), col_3, col_4, col_5
FROM null_table
WHERE col_1 = 1;

# [문제] col_2 컬럼의 값이 NULL이면 col_3 컬럼의 값으로 대체
SELECT col_1, IFNULL(col_2, col_3),  col_3, col_4, col_5
FROM null_table
WHERE col_1 = 1;


/*
    - COALESC 함수는 첫 번째 인자로 전달한 컬럼에 NULL이 있을 때
    - 그 다음 인자로 작성한 컬럼의 데이터로 대체한다.
*/
SELECT col_1, COALESCE(col_2, col_3, col_4, col_5)
FROM null_table
WHERE col_1 = 2;

/*
    - 하지만 만약 마지막 인자까지도 NULL이 저장되어 있다면
    - 결국 NULL을 반환한다.
*/
SELECT col_1, COALESCE(col_2, col_3, col_4, col_5)
FROM null_table
WHERE col_1 = 3;