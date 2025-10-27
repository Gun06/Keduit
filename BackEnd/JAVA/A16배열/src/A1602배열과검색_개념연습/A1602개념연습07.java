package A1602배열과검색_개념연습;
/*
[문제]
numberList의 각 요소가 30의 약수이거나 20의 약수일 때에는 해당 숫자를 출력하고,
그 외의 경우에는 "x"를 출력하시오.
*/
/*
[출력예시]
2 4 6 5 10 x 15 x x x 
*/
public class A1602개념연습07 {
	public static void main(String[] args) {
		 int[] numberList = {2, 4, 6, 5, 10, 9, 15, 7, 12, 13};
		    for(int i = 0; i < numberList.length; i++){
		        int a = numberList[i];
		        boolean check = 30 % a == 0 || 20 % a == 0;
		        if(check){
		        	System.out.print(a + " ");
		        }else{
		        	System.out.print("x ");
		        }
		    }
	}
}
