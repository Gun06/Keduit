package A1604배열과추가;

import java.util.Random;

/*
[문제]
numberList에서 1부터 10 사이의 랜덤 숫자 5개를 저장한 후, 
리스트 전체를 출력하시오.
*/
/*
[출력예시]
7
4
4
5
8
*/
public class A1604개념02_빈배열에반복추가 {
	public static void main(String[] args) {
		Random ran = new Random();
		int[] arr = new int[1000];
		int arrIndex = 0;
		
		for(int i = 0; i < 5; i++) {
			int r = ran.nextInt(10) + 1;
			arr[arrIndex] = r;
			arrIndex += 1;
		}
		
		for(int i = 0; i < arrIndex; i++) {
			System.out.println(arr[i]);
		}
	}
}
