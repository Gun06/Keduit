package A1602배열과검색_문제;
/*
[문제]
numberList의 각 요소 중, 십의 자리가 8보다 작고 
일의 자리가 5보다 큰 수를 출력하시오.
*/
/*
[출력예시]
39 59 56 46
*/
public class A1602문제10 {
	public static void main(String[] args) {
int[] numberList = {13, 80, 90, 39, 59, 56, 53, 25, 46, 99};

	    for(int i = 0; i < numberList.length; i++){
	        int a = numberList[i];
	        int a1 = a / 10;
	        int a2 = a % 10;
	        boolean check = a1 < 8 && a2 > 5;
	        if(check){
	        	System.out.print(a + " ");
	        }
	    }
	}
}
