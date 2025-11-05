package A1202조건문옵션elseif_문제;

import java.util.Random;

/*
[문제]
1부터 10까지의 랜덤 숫자 두 개를 각각 a와 b에 저장합니다.
새로운 랜덤 숫자(1~3)를 c에 저장합니다.

[조건]
(1) c의 값이 1이면 a와 b의 합을 출력합니다.
(2) c의 값이 2이면 a에서 b를 뺀 차이를 양수로 출력합니다.
(3) c의 값이 3이면 a와 b의 곱을 출력합니다.
(4) c의 값이 4이면 a와 b의 몫을 출력합니다.
(5) 단, elif와 else를 사용하시오.
*/
/*
[출력예시]
9 10 3
90
*/
public class A1202문제02 {
	public static void main(String[] args) {
		Random ran = new Random();
		int a = ran.nextInt(10) + 1;
		int b = ran.nextInt(10) + 1;
		int c = ran.nextInt(3) + 1;
		System.out.println(a + " " + b + " " + c);
	    int d = 0;
	    if(c == 1){
	        d = a + b;
	    }else if(c == 2){
	        d = a - b;
	        if(d < 0){
	            d = -d;
	        }
	    }else if(c == 3){
	        d = a * b;
	    }else{
	        d = a / b;
	    }
	    System.out.println(d);
	}
}
