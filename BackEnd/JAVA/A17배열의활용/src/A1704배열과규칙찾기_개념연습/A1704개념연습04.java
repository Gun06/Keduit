package A1704배열과규칙찾기_개념연습;

import java.util.Arrays;

/*
[문제]
numberList1의 값을 numberList2에 추가하시오.
단, 값을 거꾸로 추가하시오.
*/
/*
[출력예시]
[40, 30, 20, 10]
*/
public class A1704개념연습04 {
	public static void main(String[] args) {
		 int[]  numberList1 = {10, 20, 30, 40};
		    int[] numberList2 = new int[4];
		    int last = numberList1.length - 1;
		    for(int i = 0; i < numberList1.length; i++){
		        numberList2[i] = numberList1[last];
		        last -= 1;
		    }
		    System.out.println(Arrays.toString(numberList2));
	}
}
