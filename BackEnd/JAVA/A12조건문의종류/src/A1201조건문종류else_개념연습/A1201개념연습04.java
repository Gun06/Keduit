package A1201조건문종류else_개념연습;

import java.util.Random;

/*
[문제]
동전의 앞과 뒤를 랜덤 숫자 1 또는 2로 표현합니다.
랜덤 숫자(1~2)를 저장한 후, 다음과 같이 출력하시오.
단, else를 사용하시오.

[조건]
(1) 숫자 1이 나오면 "앞"을 출력하시오.
(2) 숫자 2가 나오면 "뒤"를 출력하시오.
*/
/*
[출력예시]
2
뒤
*/
public class A1201개념연습04 {
public static void main(String[] args) {
		Random ran = new Random();
		int a = ran.nextInt(2) + 1;
		System.out.println(a);
	    String b = "";
	    if(a == 1){
	        b = "앞";
	    }else{
	        b = "뒤";
	    }
	    System.out.println(b);
	}
}
