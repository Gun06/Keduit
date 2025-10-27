package A1602배열과검색;
/*
[리스트 검색과 비교 약수 연습]
numberList에서 200의 약수만 출력하시오.
*/
/*
[출력예시]
10
*/
public class A1602개념03_리스트검색과비교약수연습 {
	public static void main(String[] args) {
		int [] numberList = {10, 43, 24, 12, 52};
		for(int i = 0; i < numberList.length; i++) {
			if(200 % numberList[i]  == 0) {
				System.out.println(numberList[i]);
			}
		}
	}
}
