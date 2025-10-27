package B0102이차배열과데이터;

import java.util.Arrays;
/*
[문제]
aList와 bList는 구구단의 앞의 숫자와 뒤의 숫자를 의미한다.
앞의 숫자와 뒤의 숫자의 곱과 결과를 화면에 출력하시오.
*/
/*
[출력예시]
4 * 6 = 24
3 * 6 = 18
8 * 3 = 24
9 * 9 = 81
2 * 1 = 2
*/
public class B0102개념01_시험 {
	public static void main(String[] args) {
		 int[][] gugudan = {
		                {4, 6},
		                {3, 6},
		                {8, 3},
		                {9, 9},
		                {2, 1},
		                };

		            for(int i = 0; i < gugudan.length; i++){
		                int a = gugudan[i][0] * gugudan[i][1];
		                System.out.println(gugudan[i][0] + " * " + gugudan[i][1] + " = " + a);
		            }
	}
}
