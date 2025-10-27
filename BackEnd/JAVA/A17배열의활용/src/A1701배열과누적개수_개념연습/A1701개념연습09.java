package A1701배열과누적개수_개념연습;

import java.util.Arrays;

/*
[문제]
반복문을 활용해 10부터 50까지 반복하면서,
3의 배수이면서 십의 자리가 짝수이고 일의 자리가 홀수인 숫자만 numberList에 추가하고,
그 개수와 합을 구하여 출력하시오.
*/ 
/*
[출력예시]
21 27 45 
3
93
*/
public class A1701개념연습09 {
	public static void main(String[] args) {
	 	int[] numberList = new int[1000];

	    int count = 0;
	    int total = 0;
	    int index =0;
	    for(int i = 0; i <= 50; i++){
	        if(i % 3 == 0){
	            if(i >= 10){
	                int a = i / 10;
	                int b = i % 10;
	                boolean check1 = a % 2 == 0;
	                boolean check2 = b % 2 == 1;
	                if(check1 && check2){
	                	numberList[index] = i;
	                    count += 1;
	                    total += i;
	                    index += 1;
	                }
	            }
	        }
	    }
	    for(int i = 0; i < index; i++) {
	    	System.out.print(numberList[i] + " ");
	    }
	    System.out.println();
    	System.out.println(count);
    	System.out.println(total);
	}
}
