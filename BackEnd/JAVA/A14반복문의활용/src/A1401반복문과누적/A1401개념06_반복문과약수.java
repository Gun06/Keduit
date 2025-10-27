package A1401반복문과누적;

/*
	[반복문누적과 약수]
	반복문을 활용한 누적과 약수 개념을 함께 사용해보겠습니다.
	먼저, 1부터 18까지 18회 반복합니다. 
	이때, 값이 18의 약수인 숫자들의 합을 구하려 합니다.
 */

/*
	[출력예시]
	1 2 3 6 9 18 
	39
 */

public class A1401개념06_반복문과약수 {
	public static void main(String[] args) {
		
		int total = 0;
		
		for(int i=1; i<=18; i++) {
			boolean check = 18 % i == 0;
			if(check) {
				System.out.print(i + " ");
				total += i;
			}
		}
		
		System.out.println();
		System.out.println(total);
		
	}
}
