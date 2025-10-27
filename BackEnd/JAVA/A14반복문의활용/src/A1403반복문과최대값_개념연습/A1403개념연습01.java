package A1403반복문과최대값_개념연습;

import java.util.Random;

/*
	[문제]
	1부터 100 사이의 랜덤 숫자 10개를 출력한 후,
	그 중 3의 배수를 제외한 가장 큰 수를 출력하시오.
*/
/*
	[출력예시]
	76 99 56 32 66 55 80 93 74 33 
	80
*/
public class A1403개념연습01 {
	public static void main(String[] args) {
		Random ran = new Random();
		int max = 1;
	    for(int i = 0; i < 10; i++){
	    	int r = ran.nextInt(100) + 1;
	    	System.out.print(r + " ");
	    	
	        boolean a = r % 3 != 0;
	        if(a){
	            if(max < r){
	                max = r;
	            }
	        }
	    }
	    System.out.println();
	    System.out.println(max);
	}
}
