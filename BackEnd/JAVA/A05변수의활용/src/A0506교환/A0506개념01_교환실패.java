package A0506교환;

/*
	[교환]
	두 변수의 값을 서로 바꾸는 것을 교환이라고 합니다. 
	변수의 값을 교환하는 방법에는 두 가지가 있습니다.
	먼저, 교환이 실패하는 경우를 살펴보겠습니다. 
	
	[교환 실패]
	아래와 같이 직접 교환하면 한쪽 값이 손실됩니다.
 */

public class A0506개념01_교환실패 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		// 교환이 실패합니다.
		a = b;
		b = a;
		System.out.println(a);
		System.out.println(b);
		
	}
}
