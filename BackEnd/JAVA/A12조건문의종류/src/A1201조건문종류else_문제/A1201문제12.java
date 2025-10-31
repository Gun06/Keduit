package A1201조건문종류else_문제;

import java.util.Random;

/*
[문제]
철수는 암호 숫자를 만들었습니다. 
암호 숫자의 규칙은 숫자 5가 하나라도 포함되어 있으면 통과입니다.
100부터 999 사이의 랜덤 숫자를 저장한 후, 해당 숫자가 암호를 통과하는지 확인합니다. 
숫자 5가 포함되어 있으면 "통과", 그렇지 않으면 "실패"를 출력하시오.
단, else를 사용하시오.
*/
/*
[출력예시]
512
통과

[출력예시]
716
실패
*/
public class A1201문제12 {
	public static void main(String[] args) {
		Random ran = new Random();
		int a = ran.nextInt(900) + 100;
		System.out.println(a);
		int b = a / 100;
		int c = a % 100 / 10;
		int d = a % 10;

	    boolean e = b == 5 || c == 5 || d == 5;
	    if(e){
	    	System.out.println("통과");
	    }else{
	    	System.out.println("실패");
	    }
	}
}
