/*
    [절대값을 구하는 함수]
    ABS(숫자)
*/
SELECT ABS(-1.0), ABS(0.0), ABS(1.0);

/*
    [양수 또는 음수 여부를 판단하는 함수]
    SIGN(숫자)
    - 양수이면 1, 음수이면 -1, 0이면 0을 반환한다.
*/
SELECT SIGN(-137), SIGN(0), SIGN(137);


/*
    [천장값과 바닥값을 구하는 함수]
    CEILING(숫자)
    - 입력한 숫자보다 크거나 같은 최대 정수를 반환한다.
    FLOOR(숫자)
    - 입력한 숫자보다 작거나 같은 최소 정수를 반환한다.
*/
SELECT CEILING(2.4), CEILING(-2.4), CEILING(0.0);
SELECT CEILING(2.8), CEILING(-2.8), CEILING(0.0);

SELECT FLOOR(2.4), FLOOR(-2.4), FLOOR(0.0);
SELECT FLOOR(2.8), FLOOR(-2.8), FLOOR(0.0);



/*
    [반올림을 반환하는 함수]
    ROUND(숫자, 자릿수)

    - 자릿수 표현

     1  2  3  4 . 5 6 7 8
    -4 -3 -2 -1 0 1 2 3 4
*/

SELECT ROUND(3.14356, 0), ROUND(3.51234, 0);			# 소수점 이하 0자리
SELECT ROUND(3.14356, 1), ROUND(3.55234, 1);			# 소수점 이하 1자리
SELECT ROUND(13.14356, -1), ROUND(15.55234, -1);		# 1의 자리


# 자릿수에 3을 입력하면 소수 셋째자리까지 표현한다.
# 즉, 넷째 자리에서 반올림한 결과를 보여준다.
# 				  34.123			 34.457			        34
SELECT ROUND(34.1234, 3), ROUND(34.4567, 3), ROUND(34.4567, 0);

# 자릿수에 음수를 입력하면 정수부터 반올림을 시작한다.
#                      3500                  3400
SELECT ROUND(3452.1234, -2), ROUND(3423.4567, -2);


/*
    [버림 함수]
    TRUNCATE(숫자, 자릿수)
*/
SELECT TRUNCATE(3.14356, 0), TRUNCATE(3.51234, 0);		# 소수점 이하 0자리
SELECT TRUNCATE(3.14356, 1), TRUNCATE(3.55234, 1);		# 소수점 이하 1자리
SELECT TRUNCATE(13.14356, -1), TRUNCATE(15.55234, -1);	# 1의 자리


/*
    [거듭제곱을 계산하는 함수]
    POW(밑, 지수)
*/
# 10의 3제곱을 구함
SELECT POW(10, 3);

/*
    [나머지를 계산하는 함수]
    MOD(피제수, 제수)
*/
# 10을 3으로 나눈 나머지를 구함
SELECT MOD(10, 3);

/*
    [여러 값 중 최댓값을 반환하는 함수]
    GREATEST(숫자1, 숫자2, ...)
*/
SELECT GREATEST(10, 3, 4, 5, 3, 6);

/*
    [여러 값 중 최솟값을 반환하는 함수]
    LEAST(숫자1, 숫자2, ...)
*/
SELECT LEAST(10, 3, 4, 5, -3, 6);