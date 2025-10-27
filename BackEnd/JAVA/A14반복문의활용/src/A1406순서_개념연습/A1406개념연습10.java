package A1406순서_개념연습;

import java.util.Random;

/*
[문제]
0부터 99 사이의 랜덤 숫자 10개를 출력한 후,
그 중 일의 자리 숫자가 가장 작은 마지막 수를 출력하시오.
*/
/*
[출력예시]
25 12 56 90 32 33 71 80 87 70 
70
*/
public class A1406개념연습10 {
	public static void main(String[] args) {
		 int min = 99;
		    int result = 0;
		    Random ran = new Random();
		    for(int i = 0; i < 10; i++){
		    	int r = ran.nextInt(89) + 11;
		    	int a = r % 10;
		        System.out.print(r + " ");
		        if(min >= a){
		            min = a;
		            result = r;
		        }
		    }
		    System.out.println();
		    System.out.println(result);
	}
}
