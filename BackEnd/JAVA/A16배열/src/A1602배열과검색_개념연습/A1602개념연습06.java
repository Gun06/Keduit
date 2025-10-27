package A1602배열과검색_개념연습;
/*
[문제]
numberList의 각 요소에 대해 다음 조건을 만족하는 값을 출력하시오.

[조건]
(1) 요소가 50에서 100 사이의 값이면, 8의 배수만 출력합니다.
(2) 요소가 50에서 100 사이에 있지 않을 경우, 7의 배수만 출력합니다.
(3) 그외는 x를 출력합니다.
*/
/*
[출력예시]
35 x 42 x x x 72 x x x 
*/
public class A1602개념연습06 {
	public static void main(String[] args) {
		 int[] numberList = {35, 101, 42, 58, 98, 92, 72, 31, 3, 8};
		    for(int i = 0; i < numberList.length; i++){
		        int a = numberList[i];
		        boolean check1 = a >= 50 && a <= 100 && a % 8 == 0;
		        boolean check2 = a < 50 && a % 7 == 0;
		        boolean  check3 = a > 100 && a % 7 == 0;
		        if(check1 || check2 || check3){
		            System.out.print(a + " ");
		        }else{
		        	System.out.print("x ");
		        }
		    }
	}
}
