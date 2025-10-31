package A1002조건문과논리_문제;
/*
[문제]
1부터 9 사이의 랜덤 숫자 3개를 저장한 후, 이 3개의 숫자를 출력하고, 
세 숫자가 모두 다른지 여부를 확인하는 프로그램을 작성하시오.
같으면 o, 틀리면 x를 출력하시오.    
*/

import java.util.Random;

/*
[출력예시]
1 5 2
o    

[출력예시]
2 7 2
x        
*/
public class A1002문제06 {
	public static void main(String[] args) {
		Random ran = new Random();
		int r1 = ran.nextInt(9) + 1;
		int r2 = ran.nextInt(9) + 1;
		int r3 = ran.nextInt(9) + 1;
		System.out.println(r1 + " " + r2 + " " + r3);
		
		boolean a = r1 != r2 && r2 != r3 && r3 != r1;
	    if(a) {
	    	System.out.println("o");
	    }
	    if(!a) {
	    	System.out.println("x");
	    }
	}
}
