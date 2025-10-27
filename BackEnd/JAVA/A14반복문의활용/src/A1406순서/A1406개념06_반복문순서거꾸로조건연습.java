package A1406순서;

/*
	[반복문 순서와 거꾸로 조건 연습]
	75의 약수를 큰 수부터 작은 수까지 거꾸로 찾은 후, 
	20보다 작은 수 중에서 가장 큰 수를 출력하시오.
 */

/*
	[출력예시]
	75 25 15 5 3 1 
	15
 */

public class A1406개념06_반복문순서거꾸로조건연습 {
	public static void main(String[] args) {
		
		int num1 = 75;
		int num2 = 20;
		int count = 0;
		int find = 0;
		
		int i2 = num1;
		for(int i=1; i<=num1; i++) {
			boolean check = num1 % i2 == 0;
			if(check) {
				System.out.print(i2 + " ");
				if(i2 < num2) {
					count += 1;
				}
				if(count == 1) {
					find = i2;
				}
			}
			i2 -= 1;
		}
		
		System.out.println();
		System.out.println(find);
		
	}
}
