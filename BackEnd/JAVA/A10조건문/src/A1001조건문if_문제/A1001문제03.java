package A1001조건문if_문제;
/*
[문제]
다음은 1부터 10 사이의 숫자 두 개를 랜덤으로 생성하고, 생성된 두 숫자 중 더 큰 숫자를 출력하는 문제입니다. 
1부터 10 사이의 두 랜덤 숫자를 생성하고, 숫자들을 출력하시오. 
첫번째 숫자가 더크면 "첫번째", 두번째 숫자가 더크면 "두번째", 서로 같으면 "같다" 를 출력하시오.    
*/

import java.util.Random;

/*
[출력예시]
2 4
두번째    
*/
public class A1001문제03 {
	public static void main(String[] args) {
		Random ran = new Random();
		int a = ran.nextInt(2)+1;
		int b = ran.nextInt(2)+1;
		System.out.println(a + " " + b);
		
		if(a > b) {
	    	 System.out.println("첫번째");
	    }
	    if(a < b) {
	    	 System.out.println("두번째");
	    }
	    if(a == b) {
	    	System.out.println("같다");
	    }
	}
}
