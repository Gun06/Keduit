package A1406순서;

/*
	[반복문과 순서]
	1부터 10사이의 수 중에 3번째 홀수를 구하려 합니다. 
	이를 변수로 표현하면 다음과 같습니다.
 */

public class A1406개념01_반복문과순서 {
	public static void main(String[] args) {
		
		int count = 0;
		
		if(1 % 2 == 1) {
			count += 1;
			if(count == 3) {
				System.out.println("3번째 홀수 = " + 1);
			}
		}
		if(2 % 2 == 1) {
			count += 1;
			if(count == 3) {
				System.out.println("3번째 홀수 = " + 2);
			}
		}
		if(3 % 2 == 1) {
			count += 1;
			if(count == 3) {
				System.out.println("3번째 홀수 = " + 3);
			}
		}
		if(4 % 2 == 1) {
			count += 1;
			if(count == 3) {
				System.out.println("3번째 홀수 = " + 4);
			}
		}
		if(5 % 2 == 1) {
			count += 1;
			if(count == 3) {
				System.out.println("3번째 홀수 = " + 5);
			}
		}
	
		// 이를 반복문을 활용해 간결하게 표현해보겠습니다.
		
		count = 0;
		
		for(int i=1; i<=10; i++) {
			boolean check = i % 2 == 1;
			if(check) {
				count += 1;
				if(count == 3) {
					System.out.println("3번째 홀수 = " + i);
				}
			}
		}
		
	}
}

