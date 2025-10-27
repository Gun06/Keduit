package A1603배열과수정_개념연습;

import java.util.Arrays;

/*
[문제]
십의 자리가 20의 약수인 숫자만 해당 숫자의 백의 자리와 십의 자리를 교체한 후 
리스트 전체를 출력하시오.
*/
/*
[출력예시]
131,311,821,180,134,104
*/
public class A1603개념연습16 {
	public static void main(String[] args) {
		 int[] numberList = {131, 113, 128, 180, 134, 104};
		    for(int i = 0; i < numberList.length; i++){
		        int a = numberList[i];
		        int b = a / 100;
		        int c = a % 100 / 10;
		        int d = a % 10;
		        if(c != 0) {
		        	boolean e = 20 % c == 0;
		        	if(e){
		        		numberList[i] = d * 100 + c * 10 + b;
		        	}
		        	
		        }
		    }
		    System.out.println(Arrays.toString(numberList));
	}
}
