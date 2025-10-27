package A1703배열과순서_개념연습;

import java.util.Arrays;

/*
[문제]
1200의 약수를 큰 수부터 작은 수까지 순서대로 찾고, 
각 자리 수에 5이 포함된 숫자 두번째 부터 두 개를 출력하시오.
*/
/*
[출력예시]
240 48 
*/
public class A1703개념연습02 {
	public static void main(String[] args) {
		 int num = 1200;
		    int j = num;
		    int[] aList = new int [1200];
		    int index = 0;
		    for(int i = 1; i < num + 1; i++){
		        if(num % j == 0){
		            int a = j / 1000;
		            int b = j % 1000 / 100;
		            int c = j % 100 / 10;
		            int d = j % 10;
		            if(a == 4 || b == 4 || c == 4 || d == 4){
		                aList[index] = j;
		                index += 1;
		            }
		        }
		        j -= 1;
		    }
		    
		//    System.out.println(Arrays.toString(aList)); 

		    for(int i = 1; i < 3; i++){
		    	System.out.print(aList[i] + " ");
		    }
	}
}
