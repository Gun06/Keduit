package A1404반복문과최소값_문제;

import java.util.Random;

/*
[문제]
1부터 100 사이의 랜덤 숫자 10개를 출력한 후,
그 중 4의 배수를 제외한 가장 작은 수를 출력하시오.
*/
/*
[출력예시]
84 85 82 32 46 77 83 99 59 49 
46
*/
public class A1404문제01 {
	public static void main(String[] args) {
Random ran = new Random();
		int min = 100;
	    for(int i = 0; i < 10; i++){
	    	int r = ran.nextInt(100) + 1;
	    	System.out.print(r + " ");
	    	boolean check = r % 4 != 0;
	        if(check && min > r){
	            min = r;
	        }
	    }
	    System.out.println();
	    System.out.println(min);
	}
}
