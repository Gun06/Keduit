package A1701배열과누적개수_개념연습;

import java.util.Random;

/*
[문제]
10부터 100 사이의 랜덤 숫자 한 개를 저장한 후,
그 수의 약수들 중 짝수만 numberList에 저장하고, 그 개수와 합을 구하시오.
랜덤숫자가 홀수인경우 "홀수입니다" 출력하시오.
*/
/*
[출력예시]
78
2 6 26 78 
4
112
*/
public class A1701개념연습11 {
	public static void main(String[] args) {
		int[] numberList = new int[1000];
		int index = 0;
		Random ran = new Random();
		int r = ran.nextInt(91) + 10;
		System.out.println(r);
	    int count = 0;
	    int total = 0;
	    for(int i = 1; i < r + 1; i++){
	        if(r % i == 0){
	            if(i % 2 == 0){
	                count += 1;
	                total += i;
	                numberList[index] = i;
	                index += 1;
	            }
	        }
	    }
	    if(index == 0) {
	    	System.out.println("홀수입니다");
	    }else {
	    	for(int i = 0; i < index; i++) {
	    		System.out.print(numberList[i] + " ");
	    	}
	    	System.out.println();
	    	System.out.println(count);
	    	System.out.println(total);
	    	
	    }
	}
}
