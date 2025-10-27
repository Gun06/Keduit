package A1410무한반복_개념연습;

import java.util.Random;

/*
[문제]
1부터 10 사이의 랜덤 숫자 3개를 각각의 변수에 저장합니다.
숫자 3개의 합이 20이 되면 종료합니다.
단, 숫자 3개의 값은 서로 같으면 안 됩니다.
*/
/*
[출력예시]
9 6 5
*/
public class A1410개념연습10 {
	public static void main(String[] args) {
		Random ran = new Random();
		boolean loop = true;
	    while(loop){
	    	int r1 = ran.nextInt(10) + 1;
	    	int r2 = ran.nextInt(10) + 1;
	    	int r3 = ran.nextInt(10) + 1;
	       
	        int total = r1 + r2 + r3;
	        boolean check = r1 != r2 && r1 != r3;
	        if(total == 20 && check){
	        	System.out.println(r1 + " " + r2 + " " + r3);
	            loop = false;
	        }
	    }
	}
}
