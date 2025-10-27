package A1703배열과순서_개념연습;

import java.util.Arrays;
import java.util.Random;

/*
[문제]
11에서 99사이의 랜덤 숫자 10개를 저장 후,
십의 자리와 일의 자리의 차이가 1차이 나는 숫자를 모두 출력하시오.
*/ 
/*
[출력예시]
[18, 87, 69, 42, 81, 78, 81, 69, 53, 50]
87 78 
*/
public class A1703개념연습04 {
	public static void main(String[] args) {
		 int[]aList = new int[10];
		 Random ran = new Random();
		    for(int i =0; i < 10; i++){
		        int r = ran.nextInt(89) + 11;
		        aList[i] = r;
		    }
		    System.out.println(Arrays.toString(aList));

		    for(int i = 0; i < aList.length; i++){
		        int a = aList[i] / 10;
		        int b = aList[i] % 10;
		        int c = a - b;
		        if(c == 1 || c == -1){
		            System.out.print(aList[i] + " ");
		        }
		    }
	}
}
