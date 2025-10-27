package A1705배열과무한반복_개념연습;

import java.util.Arrays;

/*
[문제]
8의 배수 중에서 100보다 큰 수를 찾고, 그 수의 일의 자리가 4인 경우만 numberList에 저장합니다.
위 조건에 맞는 숫자 5개를 리스트에 저장한 후, 리스트 전체를 출력하시오.
*/ 
/* 
[출력예시]
104,144,184,224,264
*/
public class A1705개념연습03 {
	public static void main(String[] args) {
		 int[] numberList = new int[5];
		    int count = 0;
		    int i = 0;
		    int index = 0;
		    while(true){
		        if (i > 100){
		            int a = i % 10;
		            if(a == 4){
		            	numberList[index]= i;
		            	index += 1;
		                count += 1;
		                if(count == 5){
		                    break;
		                }
		            }
		        }
		        i += 8;
		    }
		    System.out.println(Arrays.toString(numberList));
	}
}
