package A1602배열과검색_개념연습;
/*
[문제]
numberList의 각 요소가 짝수이면서 20의 약수일 때에는 해당 숫자를 출력하고,
그 외의 경우에는 "x"를 출력하시오.
*/
/*
[출력예시]
x x x x x x 2 x 4 10 
*/
public class A1602개념연습08 {
	public static void main(String[] args) {
		int[] numberList = {1, 3, 13, 9, 8, 15, 2, 14, 4, 10};
	    for(int i = 0; i < numberList.length; i++){
	        int a = numberList[i];
	        boolean check = a % 2 == 0 && 20 % a == 0;
	        if(check){
	        	System.out.print(a + " ");
	        }else{
	        	System.out.print("x ");
	        }
	    }
	}
}
