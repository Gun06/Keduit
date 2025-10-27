package A1201조건문종류else_개념연습;

import java.util.Random;

/*
[문제]
랜덤으로 숫자 3이나 7을 출력하시오.
단, else를 사용하시오.
*/
/*
[출력예시]
1
3

[출력예시]
2
7  
*/
public class A1201개념연습05 {
public static void main(String[] args) {
		Random ran = new Random();
		int a = ran.nextInt(2) + 1;
		System.out.println(a);
	    int b = 0;
	    if(a == 1){
	        b = 3;
	    }else{
	        b = 7;
	    }
	    System.out.println(b);
	}
}
