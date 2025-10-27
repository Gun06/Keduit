package A1602배열과검색_개념연습;
/*
[문제]
numberList의 각 요소 중, 각 자리에 3, 6, 9가 포함되지 않은 숫자만 출력하시오.
*/
/*
[출력예시]
40 24 21 22
*/
public class A1602개념연습13 {
	public static void main(String[] args) {
		int[] numberList = {40, 34, 38, 30, 36, 24, 39, 21, 22, 32};
	    for(int i = 0; i < numberList.length; i++){
	        int a = numberList[i];
	        int a1 = a / 10;
	        int a2 = a % 10;
	        boolean check1 = a1 != 3 && a1 != 6 && a1 != 9;
	        boolean check2 = a2 != 3 && a2 != 6 && a2 != 9;
	        if(check1 && check2){
	        	System.out.print(a + " ");
	        }
	    }
	}
}
