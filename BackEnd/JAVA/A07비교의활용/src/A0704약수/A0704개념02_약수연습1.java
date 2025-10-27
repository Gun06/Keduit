package A0704약수;

/*
	[약수 연습1]
	어떤 수가 42의 약수인지 판별하려면, 그 수로 42를 나눈 나머지가 0이어야 합니다.
	예를 들어, 42를 3으로 나누었을 때 나머지가 0이므로 3은 42의 약수입니다.
	
	[출력예시]
	true
 */

public class A0704개념02_약수연습1 {
	public static void main(String[] args) {
		
		boolean a = 42 % 3 == 0;
		System.out.println(a);
		
	}
}
