package A1603배열과수정;

import java.util.Arrays;
/*
[문제]
numberList의 각 값을 십의 자리와 일의 자리를 서로 교환한 후, 리스트 전체를 출력하시오.
*/
/*
[출력예시]
[851, 425, 771, 871, 725]
*/
public class A1603개념03_자리수값교체 {
	public static void main(String[] args) {
		int[] numberList = {851, 425, 771, 871, 725};
		for(int i = 0; i < numberList.length; i++) {
			int a = numberList[i] / 100;
			int b = numberList[i] % 100 / 10;
			int c = numberList[i] % 10;
			int d = a * 100 + c * 10 + b;
		}
	    System.out.println(Arrays.toString(numberList));
	}
}
