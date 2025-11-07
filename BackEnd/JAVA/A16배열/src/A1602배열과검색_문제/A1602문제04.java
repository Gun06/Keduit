package A1602배열과검색_문제;
/*
[문제]
numberList의 각 요소가 5보다 작거나 10보다 크거나 3의 배수일 경우 해당 숫자를 출력하고, 
그 외의 경우에는 "x"를 출력하시오.
*/
/*
[출력예시]
4 x 12 14 15 1 11 x x 13 
*/
public class A1602문제04 {
	public static void main(String[] args) {
int[] numberList = {4, 7, 12, 14, 15, 1, 11, 10, 5, 13};
	    for(int i = 0; i < numberList.length; i++){
	        int a = numberList[i];
	        boolean check = a < 5 || a > 10 || a % 3 == 0;
	        if(check){
	        	System.out.print(a + " ");
	        }else{
	        	System.out.print("x ");
	        }
	    }
	}
}
