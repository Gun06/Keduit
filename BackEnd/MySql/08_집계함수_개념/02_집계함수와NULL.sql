
/*
    [COUNT 함수 주의사항]
    - COUNT 함수에 전체 열(*)이 아닌 특정 컬람만 지정하여 집계할 때
    - 해당 컬럼에 있는 NULL값은 제외된다.
*/
CREATE DATABASE nullsql;

USE nullsql;

CREATE TABLE student (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(30),
    score INT
);

INSERT INTO student (name, score) VALUES
('홍길동', 85),
('김유신', 90),
('이순신', NULL),
('신사임당', 95),
('강감찬', NULL);

SELECT COUNT(*) AS total_rows,
       COUNT(score) AS non_null_scores
FROM student;

