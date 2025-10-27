package A1402반복문과개수;

/*
	[반복문 개수와 약수 연습]
	반복문을 사용하여 30의 약수를 찾아 그 개수를 출력하시오.
 */

/*
	[출력예시]
	8
 */

public class A1402개념04_반복문개수와약수 {
	public static void main(String[] args) {
		
		int count = 0;
		
		for(int i=1; i<=30; i++) {
			boolean check = 30 % i == 0;
			if(check) {
				count += 1;
			}
		}
		
		System.out.println(count);
		
	}
}
