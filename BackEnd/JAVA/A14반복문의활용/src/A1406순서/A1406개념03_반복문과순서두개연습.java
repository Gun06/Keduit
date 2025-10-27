package A1406순서;

/*
	[반복문과 순서 두 개 연습]
	45의 약수를 작은 수부터 큰 수까지 순서대로 찾고, 
	첫 번째 약수와 세 번째 약수를 출력하시오.
 */

/*
	[출력예시]
	1 3 5 9 15 45 
	1
	5
 */

public class A1406개념03_반복문과순서두개연습 {
	public static void main(String[] args) {
		
		int num = 45;
		int count = 0;
		int find1 = 0;
		int find2 = 0;
		
		for(int i=1; i<=num; i++) {
			boolean check = num % i == 0;
			if(check) {
				System.out.print(i + " ");
				count += 1;
				if(count == 1) {
					find1 = i;
				}
				if(count == 3) {
					find2 = i;
				}
			}
		}
		
		System.out.println();
		System.out.println(find1);
		System.out.println(find2);
		
	}
}
