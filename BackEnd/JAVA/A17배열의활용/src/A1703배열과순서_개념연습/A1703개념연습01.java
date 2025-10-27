package A1703배열과순서_개념연습;

import java.util.Arrays;

/*
[문제]
120의 약수를 작은 수부터 큰 수까지 순서대로 찾고, 
짝수인 약수들 중 두 번째 약수부터 세 개만 출력하시오.
*/
/*
[출력예시]
[2, 4, 6, 8, 10, 12, 20, 24, 30, 40, 60, 120]
4 6 8
*/
public class A1703개념연습01 {
	public static void main(String[] args) {
		 int num = 120;
		    int[] aList = new int[1000];
		    int index = 0;
		    for(int i = 1; i < num + 1; i++){
		        if(num % i == 0 && i % 2 == 0){
		        	
		            aList[index] = i;
		            index += 1;
		        }
		    }
		    for(int i = 1; i < 4; i++){
		    	System.out.print(aList[i] + " ");
		    }
	}
}
