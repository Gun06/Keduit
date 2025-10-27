package A1204조건문의종류_삼항연산자_개념연습;

import java.util.Random;
/*
[문제]
    동전의 앞과 뒤를 랜덤숫자 1 또는 2로 표현한다.
    랜덤숫자(1~2)를 a에 저장후 아래와 같이 출력하시오.
    숫자 1이 나오면 true을 출력한다.
    숫자 2이 나오면 false를 출력한다.
    단, 삼항연산자 를 사용하시오.
[예시]
    1
    true
*/
public class A1204개념연습01 {
	public static void main(String[] args) {
		
	    
		
	   int a = 0;
	   boolean result = false;
	   
	   Random ran = new Random();
	   a = ran.nextInt(2) + 1;
	   System.out.println(a);
	   
	   result = a == 1 ? true : false;
	   System.out.println(result);
		
	}
}
