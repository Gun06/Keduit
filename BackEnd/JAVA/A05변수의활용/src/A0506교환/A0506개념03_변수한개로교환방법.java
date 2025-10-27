package A0506교환;

/*
	[변수 한 개로 교환 방법]
	앞에서는 두 개의 임시 변수를 사용하여 두 변수의 값을 교환했습니다.
	이번에는 임시 변수를 한 개만 사용하여 값을 교환하는 방법을 소개합니다.
 */

public class A0506개념03_변수한개로교환방법 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		// 임시 변수 c에 a의 값을 저장한 후, 교환을 수행합니다.
		int c = a;

		a = b;
		b = c;
		
		System.out.println(a);
		System.out.println(b);
		
	}
}
