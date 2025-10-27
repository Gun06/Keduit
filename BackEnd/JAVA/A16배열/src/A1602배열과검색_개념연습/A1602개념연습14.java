package A1602배열과검색_개념연습;
/*
[문제]
numberList에서 각 숫자의 십의 자리가 3이고 일의 자리가 7인 숫자만 출력하시오.
*/
/*
[출력예시]
237 137
*/
public class A1602개념연습14 {
	public static void main(String[] args) {
		int[] numberList = {115, 278, 237, 159, 171, 267, 137, 123, 192, 119};
	    for(int i = 0; i < numberList.length;  i++){
	        int a = numberList[i];
	        int a1 = a % 100 / 10;
	        int a2 = a % 10;
	        boolean check = a1 == 3 && a2 == 7;
	        if(check){
	        	System.out.print(a + " ");
	        }
	    }
	    
	}
}
