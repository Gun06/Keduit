package A1602배열과검색_문제;

import java.util.Random;

/*
[문제]
0부터 5 사이의 랜덤 숫자를 하나 저장하고 출력한 후, 
numberList의 값들 중 각 자릿수에 해당 랜덤 숫자가 포함된 숫자만 출력하시오.
*/
/*
[출력예시]
1
510 124 
*/
public class A1602문제15 {
	public static void main(String[] args) {
int[] numberList = {510, 423, 124, 342, 353};
		 Random ran = new Random();  
		int r = ran.nextInt(6);
		System.out.println(r);
		    for(int i = 0; i < numberList.length; i++){
		        int a = numberList[i];
		        int a1 = a / 100;
		        int a2 = a % 100 / 10;
		        int a3 = a % 10;
		        boolean check = a1 == r || a2 == r || a3 == r;
		        if(check){
		        	System.out.print(a + " ");
		        }
		    }
	}
}
