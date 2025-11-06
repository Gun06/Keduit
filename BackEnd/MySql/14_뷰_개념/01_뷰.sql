/*
    [view] 
    [1]
        뷰는 데이터베이스의 가상데이터 이다. 
        원본에서 필요한 컬럼만 복사해서 뷰를 만들수있다. 
    [2]
        주로 개발자이외의 다른 부서에서 데이터를 요청할때
        뷰로 필요한 컬럼 부분만 구성한 가상데이터를 보관하고있으면,
        보안및 편의성이 강화된다. 
    [3] 
        뷰도 테이블이기 때문에 
        인덱스를 제외한 
        모든명령어를 사용할수있다. 

*/

-- 뷰 생성
CREATE VIEW v_book
AS SELECT * FROM book;

-- 뷰 출력 
SELECT * FROM v_book;

-- 뷰 수정 (전체 출력에서 일부 출력으로 수정)
ALTER VIEW v_book
AS
SELECT book_no , book_title
FROM book;

-- 뷰 출력 
SELECT * FROM v_book;


-- 뷰 정보 확인
DESCRIBE v_book;

-- 뷰 삭제
DROP VIEW v_book;