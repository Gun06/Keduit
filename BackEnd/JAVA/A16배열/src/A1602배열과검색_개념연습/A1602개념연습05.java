package A1602배열과검색_개념연습;
/*
[문제]
numberList의 각 요소가 5보다 크고 10보다 작으며 3의 배수일 경우에는 "x"를 출력하고, 
그 외의 경우에는 해당 숫자를 출력하시오.
 */
 /*
[출력예시]
10 5 4 x 15 8 14 x 12 11
 */
public class A1602개념연습05 {
	public static void main(String[] args) {
		int[] numberList = {10, 5, 4, 6, 15, 8, 14, 9, 12, 11};

	    for(int i = 0; i < numberList.length; i++){
	        int a = numberList[i];
	        boolean check = a > 5 && a < 10 && a % 3 == 0;
	        if(check){
	        	System.out.print("x ");
	        }else{
	        	System.out.print(a + " ");
	        }
	    }
	}
}
