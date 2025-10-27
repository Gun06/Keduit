package A1602배열과검색_개념연습;
/*
[문제]
numberList에서 십의 자리는 15의 약수이고, 
일의 자리는 20의 약수인 수만 출력하시오.
*/
/*
[출력예시]
34 11 54
*/
public class A1602개념연습20 {
	public static void main(String[] args) {
		int[]  numberList = {34, 24, 23, 11, 45, 77, 54, 1, 50, 2};

	    for(int i = 0; i < numberList.length; i++){
	        int a = numberList[i];
	        int a1 = a / 10;
	        int a2 = a % 10;
	        if(a1 == 0 || a2 == 0){
	            continue;
	        }
	        boolean check1 = 15 % a1 == 0;
	        boolean check2 = 20 % a2 == 0;
	        boolean check3 = check1 && check2;
	        if(check3){
	        	System.out.print(a + " ");
	        }
	    }
	}
}
