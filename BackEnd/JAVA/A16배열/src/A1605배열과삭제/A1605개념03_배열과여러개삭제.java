package A1605배열과삭제;
/*
[문제]

각각의 숫자가 시험점수이다. 
60점미만은 전부 삭제후 출력하시오.
*/ 
/*
[출력예시]
100 93 70 95 
*/
public class A1605개념03_배열과여러개삭제 {
	public static void main(String[] args) {
		int[] numberList = {100, 93, 40, 70, 50, 95};
		int index =  0;
		
		for(int i = 0; i < numberList.length; i++) {
			if(numberList[i] >= 60) {
				numberList[index] = numberList[i];
				index += 1;
			}
		}
		
		for(int i = 0; i < index; i++) {
			System.out.print(numberList[i] + " ");
		}
		
		
	}
}
