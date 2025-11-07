package A1406순서_문제;

import java.util.Random;

/*
[문제]
11부터 99 사이의 랜덤 숫자 10개를 출력한 후,
그 중 일의 자리 숫자가 가장 작은 첫 번째 수를 출력하시오.
*/
/*
[출력예시]
68 26 79 45 91 12 81 61 43 52 
91
*/
public class A1406문제09 {
	public static void main(String[] args) {
int min = 99;
		    int result = 0;
		    Random ran = new Random();
		    for(int i = 0; i < 10; i++){
		    	int r = ran.nextInt(89) + 11;
		    	int a = r % 10;
		    	System.out.print(r + " ");
		        if(min > a){
		            min = a;
		            result = r;
		        }
		    }
		    System.out.println();
		    System.out.println(result);
	}
}
