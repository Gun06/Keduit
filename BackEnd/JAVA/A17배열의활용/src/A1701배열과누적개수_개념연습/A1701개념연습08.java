package A1701배열과누적개수_개념연습;
/*
[문제]
numberList에서 각 자리수별로 숫자를 분리하여 그 곱을 구한 후, 
그 곱이 홀수인 숫자의 개수를 구하시오.
 */ 
 /*
[출력예시]
2
 */
public class A1701개념연습08 {
	public static void main(String[] args) {
		 int[] numberList = {10, 33, 23, 13, 52};
		    int count = 0;

		    for(int i = 0; i < numberList.length; i++){
		        int a = numberList[i] % 100 / 10;
		        int b = numberList[i] % 10;
		        int c = a * b;
		        if(c % 2 == 1){
		            count += 1;
		        }
		    }
		    System.out.println(count);
	}
}
