package A1703배열과순서_개념연습;

import java.util.Arrays;
import java.util.Random;

/*
[문제]
11부터 99 사이의 랜덤 숫자 10개를 numberList에 저장한 후,
일의 자리가 가장 작은 첫 번째 수를 출력하시오.
*/ 
/*
[출력예시]
[86, 14, 53, 54, 53, 15, 25, 21, 61, 35]
21
*/
public class A1703개념연습05 {
	public static void main(String[] args) {
		int[] numberList = new int[10];
	    Random ran = new Random();
		for(int i = 0; i < 10; i++){
			int r = ran.nextInt(89) + 11;
			numberList[i] = r;
	    }
		System.out.println(Arrays.toString(numberList));

		int min = numberList[0];
	    int result = 0;
	    for(int i = 1; i < numberList.length; i++){
	        int a = numberList[i] % 10;
	        if(min > a){
	            min = a;
	            result = numberList[i];
	        }
	    }
	    System.out.println(result);
	}
}
