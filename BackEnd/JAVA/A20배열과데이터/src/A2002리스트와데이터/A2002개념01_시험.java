package A2002리스트와데이터;
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
2 * 3 = 6
6 * 7 = 42
*/
public class A2002개념01_시험 {
	public static void main(String[] args) {
		int[] aList = {4, 3, 8, 9, 2, 6};
	    int[] bList = {6, 6, 3, 9, 3, 7};
	    for(int i = 0; i < aList.length; i++){
	        int a = aList[i] * bList[i];
	        System.out.println(aList[i]  + " * " + bList[i] + " = " + a);
	    }
	}
}
