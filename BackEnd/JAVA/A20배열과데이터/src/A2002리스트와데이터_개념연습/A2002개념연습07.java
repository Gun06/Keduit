package A2002리스트와데이터_개념연습;

import java.util.Arrays;

/*
[문제]
사탕 나눠주기 행사하고 있다. 
병은 총 4병이고, 각 사탕의 개수는 각기 다르다.
사탕은 한 사람당 25개씩 나눠주고 있다.
aList 배열은 오늘 사탕을 나눠준 사람 수다.
bList 배열은 사탕을 나눠주고 난 나머지이다.
오늘 처음 가져온 사탕 수를 구하시오.

*/ 
/* 
[출력예시]
[3, 2, 1, 0]
[5, 3, 11, 22]
[80, 53, 36, 22]
*/
public class A2002개념연습07 {
	public static void main(String[] args) {
		
		int[] aList = {3, 2, 1, 0};
		int[] bList = {5, 3, 11, 22};
		int[] candyList = new int[aList.length];
		
		for(int i = 0; i < candyList.length; i++) {
			int a = aList[i] * 25;
			int b = bList[i];
			int c = a + b;
			candyList[i] = c;
		}
		
		System.out.println(Arrays.toString(aList));
		System.out.println(Arrays.toString(bList));
		System.out.println(Arrays.toString(candyList));
	}
}
