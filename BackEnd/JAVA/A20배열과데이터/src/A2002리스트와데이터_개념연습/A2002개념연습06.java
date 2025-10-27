package A2002리스트와데이터_개념연습;

import java.util.Arrays;

/*
[문제]
아래 배열 candyList 각 병에 들어있는 사탕의 양이다. 
한 사람당 한 병에서 25개씩 나눠주려 한다. 
나눠줄 수 있는 사람 수를aList에 저장하시오.
나눠주고 남은 사탕은 bList에 순차적으로 저장하시오.
*/ 
/* 
[출력예시]
[80, 53, 36, 22]
[3, 2, 1, 0]
[5, 3, 11, 22]
*/
public class A2002개념연습06 {
	public static void main(String[] args) {
		
		int[] candyList = {80, 53, 36, 22};
		int[] aList = new int[candyList.length];
		int[] bList = new int[candyList.length];
		
		for(int i = 0; i < candyList.length; i++) {
			int a = candyList[i] / 25;
			int b = candyList[i] % 25;
			aList[i] = a;
			bList[i] = b;
		}
		
		System.out.println(Arrays.toString(candyList));
		System.out.println(Arrays.toString(aList));
		System.out.println(Arrays.toString(bList));
	}
}
