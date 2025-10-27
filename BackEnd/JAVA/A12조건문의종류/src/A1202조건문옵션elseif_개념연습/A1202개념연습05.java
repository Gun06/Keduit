package A1202조건문옵션elseif_개념연습;

import java.util.Random;

/*
[문제]
동전의 앞과 뒤를 랜덤 숫자 1 또는 2로 표현합니다.
동전 두 개를 던져서, 두 동전이 모두 홀수(1)이면 "1등"을 출력하고,  
두 동전이 모두 짝수(2)이면 "2등"을 출력합니다.  
그 외의 경우는 "꽝"을 출력합니다.
단, elif와 else를 사용하시오.
*/
/*
[출력예시]
1 1
1등

[출력예시]
2 2
2등

[출력예시]
1 2
꽝
*/
public class A1202개념연습05 {
	public static void main(String[] args) {
		Random ran = new Random();
		int a= ran.nextInt(2) + 1;
		int b = ran.nextInt(2) + 1;
		System.out.println(a +" " +  b);
	    boolean check1 = a % 2 == 1;
	    boolean check2 = b % 2 == 1;
	    if(check1 && check2){
	    	System.out.println("1등");
	    }else if(!check1 && !check2){
	    	System.out.println("2등");
	    }else{
	    	System.out.println("꽝");
	    }

	}
}
