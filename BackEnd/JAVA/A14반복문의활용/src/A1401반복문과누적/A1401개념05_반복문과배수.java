package A1401반복문과누적;

/*
	[반복문누적과 배수]
	반복문을 활용한 누적과 배수 개념을 함께 사용해보겠습니다.
	먼저, 40부터 100까지 61회 반복합니다. 
	이때, 값이 8의 배수인 숫자들의 합을 구하려 합니다.
 */

/*
	[출력예시]
	40 48 56 64 72 80 88 96 
	544
 */

public class A1401개념05_반복문과배수 {
	public static void main(String[] args) {
		
		int total = 0;
		
		for(int i=40; i<=100; i++) {
			boolean check = i % 8 == 0;
			if(check) {
				System.out.print(i + " ");
				total += i;
			}
		}
		
		System.out.println();
		System.out.println(total);
		
	}
}
