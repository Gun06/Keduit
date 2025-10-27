package A1603배열과수정;

import java.util.Arrays;
/*
[리스트와 수정 연습]
numberList의 값들을 모두 1씩 증가시키시오. 
*/
/*
[출력예시]
[11, 44, 25, 13, 53]
*/
public class A1603개념02_리스트와수정연습 {
	public static void main(String[] args) {
		int[] numberList = {10, 43, 24, 12, 52};
		for(int i = 0; i < numberList.length; i++) {
			numberList[i] += 1;
		}
	    System.out.println(Arrays.toString(numberList));
	}
}
