/*
    [서버의 현재 날짜나 시간을 반환하는 함수]
    CURRENT_DATE()          - 현재 날짜 반환
    CURRENT_TIME()          - 현재 시간 반환
    CURRENT_TIMESTAMP()     - 현재 날짜와 시간 반환
    NOW()                   - 현재 날짜와 시간 반환
*/

SELECT CURRENT_DATE(), CURRENT_TIME(), CURRENT_TIMESTAMP(), NOW();

# 시간 함수 인자에 3을 입력하면, 밀리초 단위까지 출력
SELECT CURRENT_DATE(), CURRENT_TIME(3), CURRENT_TIMESTAMP(3), NOW(3);


/*
    [날짜 관련 함수]
    - CURRENT_DATE(), CURDATE() : 현재 날짜 반환
*/
SELECT CURRENT_DATE();
SELECT CURDATE();

/*
    [시간 관련 함수]
    - CURRENT_TIME(), CURTIME() : 현재 시간 반환
*/
SELECT CURRENT_TIME();
SELECT CURTIME();


/*
    [현재 날짜에서 연도, 월, 일 추출하기]
*/
SELECT NOW(), YEAR(NOW());
SELECT NOW(), MONTH(NOW());
SELECT NOW(), DAY(NOW());
SELECT(CONCAT(YEAR(NOW()), '년 ', MONTH(NOW()), '월 ', DAY(NOW()), '일'));


/*
    [날짜의 영문 이름 반환하기]
    - MONTHNAME() : 월 이름 반환 (예: October)
    - DAYNAME()   : 요일 이름 반환 (예: Sunday)
*/
SELECT NOW(), MONTHNAME(NOW());
SELECT DAYNAME(NOW());



/*
    [날짜의 순번 정보 반환하기]
    - DAYOFWEEK() : 요일 번호 (일요일=1, 월요일=2, ...)
    - DAYOFYEAR() : 해당 연도의 몇 번째 날인지 반환
    - WEEK()      : 해당 연도의 몇 번째 주인지 반환
*/
SELECT NOW(), DAYOFWEEK(NOW());		# 일요일 = 1
SELECT NOW(), DAYOFYEAR(NOW());		# 올해의 몇번째 날
SELECT NOW(), WEEK(NOW());			# 올해의 몇번째 주




/*
    UTC(Coordinated Universal Time)는 세계 표준 시간으로,
    즉 국제 표준 시간의 기준으로 쓰이는 시각을 의미한다.
    UTC_DATE()                - 접속중인 데이터베이스 서버의 현재 UTC 날짜
    UTC_TIME()                - UTC 시간
    UTC_TIMESTAMP()           - UTC 날짜와 시간
*/
SELECT CURRENT_TIMESTAMP(3), UTC_DATE(), UTC_TIME(3), UTC_TIMESTAMP(3);



/*
    [날짜를 더하거나 빼는 함수]
    DATE_ADD(날짜데이터, INTERVAL 숫자 년/월/일등의단위)
    DATE_SUB(날짜데이터, INTERVAL 숫자 년/월/일등의단위)

    - 단위                  의미
    YEAR                    년
    QUARTER                 분기
    MONTH                   월
    DAY                     일
    WEEK                    주
    HOUR                    시간
    MINUTE                  분
    SECOND                  초
    MICROSECOND             마이크로초
*/
SELECT NOW(), DATE_ADD(NOW(), INTERVAL 1 YEAR);
SELECT NOW(), DATE_SUB(NOW(), INTERVAL 1 YEAR);

# DATE_SUB 함수를 사용할 때, 음수로 입력하면 오히려 날짜를 더하게 된다.
SELECT NOW(), DATE_SUB(NOW(), INTERVAL -1 YEAR);



/*
    [날짜 간 차이를 구하는 함수]
    DATEDIFF(시작날짜, 종료날짜)
    TIMESTAMPDIFF(년/월/일등의단위, 시작날짜, 종료날짜)
*/

# 날짜 간의 일수 차 반환
SELECT DATEDIFF('2026-03-23', NOW());

# 날짜 간의 개월 수 차 반환
SELECT TIMESTAMPDIFF(MONTH, '2026-03-23', NOW());



/*
    [지정한 날짜의 요일을 반환하는 함수]
    DAYNAME(날짜)
*/
SELECT DAYNAME(NOW());

# 'Monday'
SELECT DAYNAME('2026-03-23');



/*
    [날짜에서 연, 월, 주, 일을 값으로 가져오는 함수]
    YEAR(날짜)
    MONTH(날짜)
    WEEK(날짜)
    DAY(날짜)
*/

SELECT YEAR(NOW()), MONTH(NOW()), WEEK(NOW()), DAY(NOW());



/*
    [날짜 형식을 변환하는 함수]
    DATE_FORMAT(날짜, '년/월/일등의 형식 문자')
    - 날짜를 다양한 형식으로 표현해야 할 때 사용한다.
    - 나라마다 날짜를 표현하는 방식이 다르므로 날짜 형식을 변환해야 할 때 필요하다.
*/
#미국에서 사용하는 날짜 형식으로 표시
SELECT DATE_FORMAT(NOW(), '%m/%d/%Y');

SELECT DATE_FORMAT(NOW(), '%Y-%m-%d');
SELECT DATE_FORMAT(NOW(), '%Y년 %m월 %d일');
SELECT DATE_FORMAT(NOW(), '%H시 %i분 %s초');

/*
    GET_FORMAT(DATE|TIME|DATETIME, '지역(국가)형식 문자')
    - 국가나 지역별 표준 날짜 형식을 확인할 수 있다.
*/
SELECT GET_FORMAT(DATE, 'USA') AS USA,				/* 미국 */
	   GET_FORMAT(DATE, 'JIS') AS JIS,				/* 일본 산업 표준 */
       GET_FORMAT(DATE, 'EUR') AS Europe,			/* 유럽 */
       GET_FORMAT(DATE, 'ISO') AS ISO,				/* 국제 표준화 기구 */
       GET_FORMAT(DATE, 'INTERNAL') AS INTERNAL;	/* MySQL 내부 형식 */

# DATE_FORMAT과 GET_FORMAT 함수 조합
SELECT DATE_FORMAT(NOW(), GET_FORMAT(DATE, 'USA'));       