package A1602배열과검색_개념연습;
/*
[문제]
numberList에서 십의 자리가 20의 약수인 수만 출력하시오.
*/
/*
[출력예시]
113 157 149 121
*/
public class A1602개념연습19 {
	public static void main(String[] args) {
		 int[] numberList = {131, 113, 138, 180, 134, 173, 157, 149, 121, 104};
		    
		    for(int i = 0; i < numberList.length; i++){
		        int a = numberList[i];
		        int a1 = a % 100 / 10;
		        if(a1 == 0){
		            continue;
		        }
		        boolean check = 20 % a1 == 0;
		        if(check){
		        	System.out.print(a + " ");
		        }
		    }
	}
}
