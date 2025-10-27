package A1406순서;

/*
	[반복문 순서와 거꾸로 연습]
	75의 약수를 큰 수부터 작은 수까지 거꾸로 찾은 후, 
	다섯 번째 약수를 출력하시오.
 */

/*
	[출력예시]
	75 25 15 5 3 1 
	3
 */


public class A1406개념05_반복문순서와거꾸로연습 {
	public static void main(String[] args) {
		
		int num = 75;
		int count = 0;
		int find = 0;
		
		int i2 = num;
		for(int i=1; i<=num; i++) {
			boolean check = num % i2 == 0;
			if(check) {
				System.out.print(i2 + " ");
				count += 1;
				if(count == 5) {
					find = i2;
				}
			}
			i2 -= 1;
		}
		
		System.out.println();
		System.out.println(find);
		
	}
}
