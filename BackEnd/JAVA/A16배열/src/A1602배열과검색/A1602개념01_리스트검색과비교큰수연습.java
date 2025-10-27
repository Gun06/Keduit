package A1602배열과검색;
/*
[리스트 검색과 비교 큰 수 연습]
numberList에서 25보다 큰 수만 출력하시오.
*/
/*
[출력예시]
30
40
50

*/
public class A1602개념01_리스트검색과비교큰수연습 {
	public static void main(String[] args) {
		int [] numberList = {10, 20, 30, 40, 50};
		for(int i = 0; i < numberList.length; i++) {
			if(numberList[i] > 25) {
				System.out.println(numberList[i]);
			}
		}
	}
}
