
-- 1. 학생 테이블의 모든 열을 검색하라
SELECT * FROM student;

-- 2. 학생 테이블의 이름, 학년, 주소 열만 선택적으로 검색하라
SELECT STUDENT_NAME, STUDENT_GRADE, STUDENT_ADDR FROM student;

-- 3. 학생 테이블의 이름과 주소 열만 검색하라
SELECT STUDENT_NAME, STUDENT_ADDR FROM student;

-- 4. 학생 번호가 1인 학생을 검색하라
SELECT STUDENT_NO, STUDENT_NAME FROM student WHERE STUDENT_NO = 1;

-- 5. 키가 165 미만인 학생을 검색하라
SELECT STUDENT_NAME, STUDENT_HEIGHT FROM student WHERE STUDENT_HEIGHT < 165;

-- 6. 1학년이고 동시에 키가 170 이상인 학생의 이름, 학년, 키, 몸무게 을 검색하라
SELECT STUDENT_NAME, STUDENT_GRADE, STUDENT_HEIGHT, STUDENT_WEIGHT FROM student
WHERE STUDENT_GRADE = 1 AND STUDENT_HEIGHT >= 170;

-- 7. 몸무게 45보다 크거나 같고 50보다 작거나 같은 학생의 이름, 주소, 키, 몸무게을 검색 
SELECT STUDENT_NAME, STUDENT_ADDR, STUDENT_HEIGHT, STUDENT_WEIGHT FROM student
WHERE 45 <= STUDENT_WEIGHT AND STUDENT_WEIGHT <= 50;

-- 8. 학생의 번호, 이름, 학년을 검색하라
SELECT STUDENT_NO, STUDENT_NAME, STUDENT_GRADE FROM student;

-- 9. 박씨 성을 가진 학생을 검색하라
SELECT STUDENT_NAME FROM student WHERE STUDENT_NAME LIKE '박%';

-- 10. 학생 테이블에서 모든 열에 저장된 데이터를 검색하되, 이름 가나다순으로 정렬하여 출력하라
SELECT * FROM student ORDER BY STUDENT_NAME ASC;

-- 11. 학생의 이름, 주소, 키 데이터를 검색하되 키가 큰 학생부터 출력하라
SELECT STUDENT_NAME, STUDENT_ADDR, STUDENT_HEIGHT FROM student
ORDER BY STUDENT_HEIGHT DESC;

-- 12. 1학년 학생의 이름, 학년, 주소, 몸무게 데이터를 검색하라(단 ,반드시 체중이 적은 학생부터 출력하라)
SELECT STUDENT_NAME, STUDENT_GRADE, STUDENT_ADDR, STUDENT_HEIGHT FROM student
WHERE STUDENT_GRADE = 1 ORDER BY STUDENT_WEIGHT ASC;

-- 13. 1학년 학생의 이름, 학년, 키, 몸무게 데이터를 검색하라(단, 키 내림차순으로 정렬하고, 같은 키는 몸무게 오름차순으로 정렬)
SELECT STUDENT_NAME, STUDENT_GRADE, STUDENT_HEIGHT, STUDENT_WEIGHT FROM student
WHERE STUDENT_GRADE = 1 ORDER BY STUDENT_HEIGHT DESC, STUDENT_WEIGHT ASC;

-- 14. 학생의 번호, 이름, 주소를 검색하되 이름을 가나다 순으로 정렬해라
SELECT STUDENT_NO, STUDENT_NAME, STUDENT_ADDR FROM student
ORDER BY STUDENT_NAME ASC;


-- 15. 키가 165인 학생의 번호, 이름, 키를 검색하라
SELECT STUDENT_NO, STUDENT_NAME, STUDENT_HEIGHT FROM student
WHERE STUDENT_HEIGHT = 165;


-- 16. 학생의 수를 검색하라
SELECT COUNT(*) FROM student;

-- 17. 번호가 1인 과목의 평균 점수를 검색하라
SELECT AVG(SCORE) FROM course_history WHERE STUDENT_NO = 1;

-----------------------------------------------------------------------------------------------
