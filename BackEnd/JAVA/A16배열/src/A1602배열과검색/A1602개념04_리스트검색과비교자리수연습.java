package A1602배열과검색;
/*
[리스트 검색과 비교 자리수 연습]
numberList에서 백의 자리가 2인 수만 출력하시오.
*/
/*
[출력예시]
1210
1212
*/

public class A1602개념04_리스트검색과비교자리수연습 {
	public static void main(String[] args) {
		int [] numberList = {1210, 1343, 1524, 1212, 7452};
		for(int i = 0; i < numberList.length; i++) {
			int a = numberList[i];
			int b = a % 1000 / 100;
			boolean c = b == 2;
			if(c) {
				System.out.println(a);
			}
		}
	}
}
