package A1604배열과추가;

import java.util.Random;
/*
[리스트 추가 연습]
arr 에 bList의 값을 순차적으로 추가하시오.

[보기]
int[] bList = {13,33,52,12,24,1};
*/
/*
[출력예시]
13
33
52
12
24
1
*/
public class A1604개념03_빈배열에추가연습 {
	public static void main(String[] args) {
		Random ran = new Random();
		int[] arr = new int[1000];
		int arrIndex = 0;
		
		int[] bList = {13,33,52,12,24,1};
		
		for(int i = 0; i < bList.length; i++) {
			
			arr[arrIndex] = bList[i];
			arrIndex += 1;
		}
		
		for(int i = 0; i < arrIndex; i++) {
			System.out.println(arr[i]);
		}
	}
}
