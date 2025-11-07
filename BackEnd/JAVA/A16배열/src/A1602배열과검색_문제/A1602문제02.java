package A1602배열과검색_문제;
/*
[문제]
numberList의 각 요소가 3의 배수일 경우 해당 숫자를 출력하고, 
3의 배수가 아닐 경우에는 "x"를 출력하시오.
*/
/*
[출력예시]
x x 24 12 x
*/
public class A1602문제02 {
	public static void main(String[] args) {
int[] numberList = {10, 43, 24, 12, 52};
	    for(int i = 0; i < numberList.length; i++){
	        boolean check1 = numberList[i] % 3 == 0;
	        boolean check2 = numberList[i] % 3 == 1;
	        if(check1){
	        	System.out.print(numberList[i] + " ");
	        }else{
	        	System.out.print("x ");
	        }
	    }
	}
}
