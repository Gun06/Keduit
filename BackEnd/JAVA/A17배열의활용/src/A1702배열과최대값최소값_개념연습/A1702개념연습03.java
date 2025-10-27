package A1702배열과최대값최소값_개념연습;

import java.util.Arrays;
import java.util.Random;

/*
[문제]
1부터 100 사이의 랜덤 숫자 10개를 저장한 후, 3의 배수를 제외하고 가장 큰 수를 구하시오.
*/
/*
[출력예시]
[44, 29, 22, 67, 4, 100, 100, 74, 37, 71]
44
*/
public class A1702개념연습03 {
	public static void main(String[] args) {
		 int []numberList = new int[10];
		 Random ran = new Random();   
		 for(int i = 0; i < 10; i++){
			 int r = ran.nextInt(100) + 1;
			 	numberList[i] = r;
		    }
		 System.out.println(Arrays.toString(numberList));
		    int max = numberList[0];

		    for(int i = 1; i < numberList.length; i++){
		        boolean check = numberList[i] % 3 == 0;
		        if(check && max < numberList[i]){
		            max = numberList[i];
		        }
		    }
		    System.out.println(max);
	}
}
