package A1602배열과검색_문제;
/*
[문제]
numberList에서 백의 자리는 3의 배수, 십의 자리는 4의 배수, 일의 자리는 5의 배수인 숫자만 선택하되, 
각 자릿수에 0이 포함되지 않은 숫자만 출력하시오.
*/
/*
[출력예시]
645 345 385 685 
*/
public class A1602문제18 {
	public static void main(String[] args) {
int[]  numberList = {645, 229, 345, 314, 508, 385, 852, 641, 685, 435};

	    for(int i = 0; i < numberList.length; i++){
	        int a = numberList[i];
	        int a1 = a / 100;
	        int a2 = a % 100 / 10;
	        int a3 = a % 10;
	        boolean check1 = a1 != 0 && a2 != 0 && a3 != 0;
	        boolean check2 = a1 % 3 == 0 && a2 % 4 == 0 && a3 % 5 == 0;
	        if(check1 && check2){
	        	System.out.print(a + " ");
	        }
	    }
	}
}
