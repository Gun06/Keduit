package A1110조건문과중첩_문제;
import java.util.Random;
/*
[문제]
100부터 999 사이의 랜덤 숫자를 저장하고,
각 자리수가 20의 약수인 누적을 구하시오.     
*/
/*
[출력예시]
572
7    
*/
public class A1110문제05 {
	public static void main(String[] args) {
		Random ran = new Random();
		int r = ran.nextInt(900) + 1;
		System.out.println(r);

	    int a = r / 100;
	    int b = r % 100 / 10;
	    int c = r % 10;
	    boolean d = a != 0 && b != 0 && c != 0;
	    if(d) {
	    	 int total = 0;
	 	    if(20 % a == 0) {
	 	        total = total + a;
	 	    }
	 	    if(20 % b == 0) {
	 	        total = total + b;
	 	    }
	 	    if(20 % c == 0) {
	 	        total = total + c;
	 	    }
	 	    System.out.println(total);
	    }
	    if(!d) {
	    	System.out.println("0이 있습니다.");
	    }
	}
}
