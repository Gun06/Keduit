package A2002리스트와데이터_개념연습;

import java.util.Arrays;

/*
[문제]
aList와 bList는 구구단의 앞의 숫자와 뒤의 숫자를 의미한다.
앞의 숫자와 뒤의 숫자의 곱을 cList에 추가하시오.
*/ 
/*
[출력예시]
[4, 3, 8, 9, 2, 6]
[6, 6, 3, 9, 3, 7]
[24, 18, 24, 81, 6, 42]
*/
public class A2002개념연습01 {
	public static void main(String[] args) {
		int[] aList = {4, 3, 8, 9, 2, 6};
		int[] bList = {6, 6, 3, 9, 3, 7};
		int[] cList = new int[aList.length];
		
		for(int i = 0; i < aList.length; i++) {
			int a = aList[i] * bList[i];
			cList[i] = a;
		}
		System.out.println(Arrays.toString(aList));
		System.out.println(Arrays.toString(bList));
		System.out.println(Arrays.toString(cList));
	}
}
