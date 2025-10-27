package A1602배열과검색_개념연습;
/*
[문제]
numberList의 값들 중, 한 자릿수는 짝수이고 다른 자릿수는 홀수인 숫자만 출력하시오.
*/
/*
[출력예시]
10 43 52 
*/
public class A1602개념연습17 {
	public static void main(String[] args) {
		int[] numberList = {10, 43, 24, 11, 52};
	    for(int i = 0; i < numberList.length; i++){
	        int a = numberList[i];
	        int a1 = a / 10;
	        int a2 = a % 10;
	        boolean check1 = a1 % 2 == 0 && a2 % 2 == 1;
	        boolean check2 = a1 % 2 == 1 && a2 % 2 == 0;
	        boolean check3 = check1 || check2;
	        if(check3){
	        	System.out.print(a + " ");
	        }
	    }
	}
}
