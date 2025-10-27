package A1602배열과검색;
/*
[리스트 검색과 비교 배수 연습]
numberList에서 4의 배수만 출력하시오.
*/
/*
[출력예시]
20
40
*/
public class A1602개념02_리스트검색과비교배수연습 {
	public static void main(String[] args) {
		int [] numberList = {10, 20, 30, 40, 50};
		for(int i = 0; i < numberList.length; i++) {
			if(numberList[i] % 4 == 0) {
				System.out.println(numberList[i]);
			}
		}
	}
}
