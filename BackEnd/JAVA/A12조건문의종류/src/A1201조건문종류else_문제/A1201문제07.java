package A1201조건문종류else_문제;

import java.util.Random;

/*
[문제]
1부터 9사이의 랜덤숫자 3개를 저장합니다.
3개의 랜덤숫자를 저장하고 모두 같은지 비교하여 
같으면 "o"를 출력하고, 틀리면 "x"를 출력하시오.
단, else를 사용하시오.
*/
/*
[출력예시]
3 3 3
o
*/
public class A1201문제07 {
public static void main(String[] args) {
		Random ran = new Random();
		int a = ran.nextInt(9) + 1;
		int b = ran.nextInt(9) + 1;
		int c = ran.nextInt(9) + 1;
		System.out.println(a + " " + b + " " + c);
	    boolean d = a != b && a != c;
	    if (d){
	        System.out.println(true);
	    }else{
	    	System.out.println(false);
	    }
	}
}
