package A1701배열과누적개수_개념연습;

import java.util.Arrays;
import java.util.Random;

/*
[문제]
1부터 10 사이의 랜덤 숫자 5개를 numberList에 추가한 후, 
5보다 큰 수의 개수를 구하시오.
*/
/*
[출력예시]
[7, 5, 9, 4, 1]
2
*/
public class A1701개념연습01 {
	public static void main(String[] args) {
		int[] numberList = new int[5];
	    Random ran= new Random();
	    int index = 0;
	    for(int i = 0; i < 5;  i++){
			int r = ran.nextInt(10)+ 1;
			numberList[index] = r;
			index += 1;
	    }
	    System.out.println(Arrays.toString(numberList));

	    int count = 0;
	    for(int i = 0; i < numberList.length; i++){
	        if(numberList[i] > 5){
	            count += 1;
	        }
	    }
	    System.out.println(count);
	}
}
