package A1602배열과검색_문제;
/*
[문제]
numberList에서 25보다 작은 수만 출력하시오.
*/ 
/*
[출력예시]
10 20
*/
public class A1602문제01 {
	public static void main(String[] args) {
int[] numberList = {10, 20, 30, 40, 50};
	    for(int i = 0; i < numberList.length; i++){
	        if(numberList[i] < 25){
	        	System.out.println(numberList[i]);
	        }
	    }
	}
}
