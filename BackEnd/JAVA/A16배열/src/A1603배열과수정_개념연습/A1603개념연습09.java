package A1603배열과수정_개념연습;

import java.util.Arrays;

/*
[문제]
numberList에서 일의 자리가 5보다 크고, 십의 자리가 8보다 작은 숫자를 찾아, 
해당 숫자들을 전부 음수로 변경한 후 리스트 전체를 출력하시오.
*/
/*
[출력예시]
13,80,90,39,59,56,53,25,46,99
13,80,90,-39,-59,-56,53,25,-46,99
*/
public class A1603개념연습09 {
	public static void main(String[] args) {
		 int[] numberList = {13, 80, 90, 39, 59, 56, 53, 25, 46, 99};
		 System.out.println(Arrays.toString(numberList));
		    for(int i = 0; i < numberList.length; i++){
		        int a = numberList[i] / 10;
		        int b = numberList[i] % 10;
		        if(a < 8 && b > 5){
		            numberList[i] = -numberList[i];
		        }
		    }
		    System.out.println(Arrays.toString(numberList));
	}
}
