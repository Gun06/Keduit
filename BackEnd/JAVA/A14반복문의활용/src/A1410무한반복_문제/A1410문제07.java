package A1410무한반복_문제;

import java.util.Random;

/*
[문제]
1부터 9 사이의 랜덤 숫자 2개를 저장한 후,
두 숫자의 합이 반드시 10이 되도록 출력하시오.
*/
/*
[출력예시]
4 6
*/
public class A1410문제07 {
	public static void main(String[] args) {
boolean loop = true;
		  Random ran = new Random();
		    while(loop){
		    	int a = ran.nextInt(9) + 1;
		    	int b = ran.nextInt(9) + 1;
		    	int total = a + b;
		    	
		        if(total == 10){
		        	System.out.println(a + " " + b);
		            loop = false;
		        }
		    }
	}
}
