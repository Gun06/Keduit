package A1406순서;

/*
	[반복문 순서와 조건 연습]
	200의 약수를 작은 수부터 큰 수까지 순서대로 찾은 후, 
	그 중 30보다 큰 수 중에서 가장 작은 수를 출력하시오.
 */

/*
	[출력예시]
	1 2 4 5 8 10 20 25 40 50 100 200 
	40
 */

public class A1406개념04_반복문순서와조건연습 {
	public static void main(String[] args) {
		
		int num1 = 200;
		int num2 = 30;
		int count = 0;
		int find = 0;
		
		for(int i=1; i<=num1; i++) {
			boolean check = num1 % i == 0;
			if(check) {
				System.out.print(i + " ");
				if(i > num2) {
					count += 1;
				}
				if(count == 1) {
					find = i;
				}
			}
		}
		
		System.out.println();
		System.out.println(find);
		
	}
}
