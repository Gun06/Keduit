package A1703배열과순서_개념연습;

import java.util.Arrays;
import java.util.Random;

/*
[문제]
0부터 99 사이의 랜덤 숫자 10개를 numberList에 저장한 후,
일의 자리가 가장 작은 마지막 수를 출력하시오.
 */ 
 /*
[출력예시]
[99, 99, 58, 91, 10, 94, 78, 80, 53, 65]
80
 */
public class A1703개념연습06 {
	public static void main(String[] args) {
		 int[] aList = new int[10];
		 Random ran =new Random();   
		 for(int i = 0; i < 10; i++){
			 int r = ran.nextInt(100);
			 aList[i] = r;
		    }
		 System.out.println(Arrays.toString(aList));
		    int min = aList[0];
		    int result = 0;
		    for(int i = 1; i < aList.length; i++){
		        int a = aList[i] % 10;
		        if(min >= a){
		            min = a;
		            result = aList[i];
		        }
		    }
		    System.out.println(result);
	}
}
