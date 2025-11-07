package A1602배열과검색_문제;
/*
[문제]
numberList의 값들 중, 모든 자릿수가 짝수이거나 모든 자릿수가 홀수인 숫자만 출력하시오.
*/
/*
[출력예시]
17
*/
public class A1602문제16 {
	public static void main(String[] args) {
int[]  numberList = {17, 43, 34, 10, 52};
		    for(int i = 0; i < numberList.length; i++){
		        int a = numberList[i];
		        int a1 = a / 10;
		        int a2 = a % 10;
		        if(a1 == 0 || a2 == 0){
		            continue;
		        }
		        boolean check1 = a1 % 2 == 0 && a2 % 2 == 0;
		        boolean check2 = a1 % 2 == 1 && a2 % 2 == 1;
		        boolean check3 = check1 || check2;
		        if(check3){
		        	System.out.print(a + " ");
		        }
		    }
	}
}
