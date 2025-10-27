package A1603배열과수정_개념연습;

import java.util.Arrays;

/*
[문제]
numberList에서 
백의자리는 십의 자리로이동하고,
십의 자리는 일의 자리로 이동하고,
일의 자리는 백의 자리로 이동한후 출력하시오.
예) 123 => 312
*/
/*
[출력예시]
[645, 229, 345, 314, 508, 385, 852, 641, 685, 435]
[564, 922, 534, 431, 850, 538, 285, 164, 568, 543]
*/
public class A1603개념연습15 {
	public static void main(String[] args) {
		 int[] numberList = {645, 229, 345, 314, 508, 385, 852, 641, 685, 435};
		 System.out.println(Arrays.toString(numberList));
		    for(int i = 0; i < numberList.length; i++){
		        int a = numberList[i] / 100;
		        int b = numberList[i] % 100 / 10;
		        int c = numberList[i] % 10;
		        numberList[i] = c * 100 + a * 10 + b;
		    }
		    System.out.println(Arrays.toString(numberList));
	}
}
