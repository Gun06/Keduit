package A1401반복문과누적;

/*
	[반복문과 누적 and]
	반복문을 활용한 누적 개념과 and 논리 연산자를 함께 사용해보겠습니다.
	먼저, 1부터 15까지 15회 반복합니다. 
	이때, 값이 5보다 크고 10보다 작은 숫자들의 합을 구하려 합니다.
 */

/*
	[출력예시]
	6 7 8 9 
	30
 */

public class A1401개념03_반복문과누적and {
	public static void main(String[] args) {
		
		int total = 0;
		
		for(int i=1; i<=15; i++) {
			boolean check = 5 < i && i < 10;
			if(check) {
				System.out.print(i + " ");
				total += i;
			}
		}
		
		System.out.println();
		System.out.println(total);
		
	}
}
