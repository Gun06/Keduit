package A1602배열과검색_개념연습;
/*
[문제]
numberList의 각 요소 중, 십의 자리 또는 일의 자리에 
숫자 5가 포함된 숫자를 출력하시오.
*/
/*
[출력예시]
153 151 154 135
*/
public class A1602개념연습12 {
	public static void main(String[] args) {
		 int[] numberList = {153, 151, 143, 160, 134, 130, 154, 146, 164, 135};
		    for(int i = 0; i < numberList.length; i++){
		        int a = numberList[i];
		        int a1 = a / 100;
		        int a2 = a % 100 / 10;
		        int a3 = a % 10;
		        boolean check = a1 == 5 || a2 == 5 || a3 == 5;
		        if(check){
		        	System.out.print(a + " ");
		        }
		    }
	}
}
