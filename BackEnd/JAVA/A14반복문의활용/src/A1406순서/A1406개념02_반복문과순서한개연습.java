package A1406순서;

/*
	[반복문과 순서 한 개 연습]
	75의 약수를 작은 수부터 큰 수까지 순서대로 찾고, 
	다섯 번째 약수를 출력하시오.
 */

/*
	[출력예시]
	1 3 5 15 25 75 
	25
 */

public class A1406개념02_반복문과순서한개연습 {
	public static void main(String[] args) {
		
		int num = 75;
		
		int count = 0;
		int find = 0;
		
		for(int i=1; i<=num; i++) {
			boolean check = num % i == 0;
			if(check) {
				System.out.print(i + " ");
				count += 1;
				if(count == 5) {
					find = i;
				}
			}
		}
		
		System.out.println();
		System.out.println(find);
		
	}
}
