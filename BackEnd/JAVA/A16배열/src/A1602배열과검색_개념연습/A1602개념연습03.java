package A1602배열과검색_개념연습;
/*
[문제]
numberList의 각 요소가 홀수일 경우 해당 숫자를 출력하고, 
짝수일 경우에는 "x"를 출력하시오.
*/
/*
[출력예시]
9 x 3 5 x x x 7 x 1 
*/
public class A1602개념연습03 {
	public static void main(String[] args) {
		int[] numberList = {9, 2, 3, 5, 10, 8, 4, 7, 6, 1};
	    for(int i = 0; i < numberList.length; i++){
	        boolean check = numberList[i] % 2 == 1;
	        if(check){
	        	System.out.print(numberList[i] + " ");
	        }else{
	        	System.out.print("x ");
	        }
	    }
	}
}
