/*

    CASE 문을 사용해서 조건을 표현할수있다.

    (1) CASE
        프로그래밍언어의 스위치 케이스 문과 사용법이 같다. 
        CASE 'A' 조건이 WHEN 'B' 사실이면 THEN 'C' 가 실행된다. 
        즉, CASE == WHEN 이면 THEN 실행이다. 

        WHEN , THEN 은 원하는 조건수만큼 사용하고 마지막은 ELSE 를 사용할수있다. 
    (2) END 
        CASE 는 END 로 마무리한다. 
        단 , END 로 만하면 컬럼이 굉장히 지저분해지기때문에
        END AS '변경한컬럼명' 을 사용한다. 
*/

-- [문제] CASE문을 이용하여 회원의 성별을 문자로 표시하시오.

-- 아래는 상당히 지저분한 컬럼명이 출력된다. 
SELECT 
    member_id,
    member_name,
    CASE member_gender 
        WHEN 'm' THEN '남성'
        WHEN 'w' THEN '여성'
        ELSE '기타'
    END 
FROM member;

-- 컬럼명을 변경한다. 
SELECT 
    member_id,
    member_name,
    CASE member_gender 
        WHEN 'm' THEN '남성'
        WHEN 'w' THEN '여성'
        ELSE '기타'
    END AS gender_label
FROM member;