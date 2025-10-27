package A0902논리와약수;

/*
	[약수와 ||(or)]
	15가 30의 약수이면서 5의 배수인지 확인하는 식을 작성해보겠습니다.
 */

public class A0902개념01_논리와약수 {
	public static void main(String[] args) {
		
		int a = 15;
		
		boolean b = 30 % a == 0;
		boolean c = a % 5 == 0;
		boolean d = b && c;
		System.out.println(d);
		
	}
}
