package A1603배열과수정_문제;
/*
[문제]
numberList에서 랜덤으로 하나의 인덱스를 저장한 후, 
해당 인덱스의 값이 홀수이면 1 증가시키고 리스트 전체를 출력하시오.
*/

import java.util.Arrays;
import java.util.Random;

/*
[출력예시]
3
9,42,24,12,51
*/
public class A1603문제02 {
	public static void main(String[] args) {
Random ran= new Random();
		  int[] numberList = {9, 42, 24, 11, 51};
		  int r = ran.nextInt(numberList.length);
		  System.out.println(r);
		    if(numberList[r] % 2 == 1){
		        numberList[r] += 1;
		    }
		    System.out.println(Arrays.toString(numberList));
	}
}
