package A0901논리와배수;

/*
	[배수와 &&(and)]
	12는 3의 배수이면서 5의 배수인지 확인하는 식을 작성해보겠습니다. 
 */

public class A0901개념01_논리와배수 {
	public static void main(String[] args) {
		
		int a = 12;
		
		/*
			12가 3의 배수인지 확인하려면 12를 3으로 나눴을 때 그 나머지가 0 이어야 하고,
			12를 5로 나눴을 때 그 나머지가 0 이어야 5의 배수라고 할 수 있습니다.
			이를 모두 만족하려면 && 연산자로 연결해 다음과 같이 작성할 수 있습니다.		 
		 */
		boolean b = a % 3 == 0;
		boolean c = a % 5 == 0;
		boolean d = b && c;
		System.out.println(d);
		
	}
}
