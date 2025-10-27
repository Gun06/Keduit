package A1603배열과수정_개념연습;
/*
[문제]
numberList에서 랜덤으로 하나의 인덱스를 저장한 후, 
해당 인덱스의 값을 1 증가시키고 리스트 전체를 출력하시오.
*/

import java.util.Arrays;
import java.util.Random;

/*
[출력예시]
2
[10, 43, 25, 12, 52]
*/
public class A1603개념연습01 {
	public static void main(String[] args) {
		Random ran = new Random();
		 int[] numberList = {10, 43, 24, 12, 52};
		 int r = ran.nextInt(numberList.length);
		    numberList[r] += 1;
		    System.out.println(Arrays.toString(numberList)); 
		   
	}
}
