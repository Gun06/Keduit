package A1402반복문과개수;

/*
	[반복문 개수와 약수]
	5의 약수의 개수를 구하려고 합니다.  
	이를 변수로 표현하면 다음과 같습니다.
	
	각 숫자가 5로 나누어떨어지는지 확인하는 조건식을 사용하여 count 값을 1씩 증가시킵니다. 
	이 과정을 통해 1과 5가 5의 약수이며, 그 개수는 2개라는 것을 알 수 있습니다.
 */

public class A1402개념02_반복문개수와약수 {
	public static void main(String[] args) {
		
		int num = 5;
		int count = 0;
		
		if(num % 1 == 0) {
			count += 1;
		}
		
		if(num % 2 == 0) {
			count += 1;
		}
		
		if(num % 3 == 0) {
			count += 1;
		}
		
		if(num % 4 == 0) {
			count += 1;
		}
		
		if(num % 5 == 0) {
			count += 1;
		}
		
		System.out.println(count);
		
		// 이를 반복문을 활용해 간결하게 표현해보겠습니다.
		count = 0;
		
		for(int i=1; i<=5; i++) {
			boolean check = 5 % i == 0;
			if(check) {
				count += 1;
			}
		}
		System.out.println(count);
		
	}
}
