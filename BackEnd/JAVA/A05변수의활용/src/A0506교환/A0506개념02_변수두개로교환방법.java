package A0506교환;

/*
	[변수 두 개로 교환 방법]
	두 임시 변수 c와 d를 사용하여 변수 a와 b의 값을 교환할 수 있습니다.
	이 방법은 a와 b의 값이 각각 c와 d에 저장되므로, 원래 값이 손상되지 않고 교환이 가능합니다.
 */

public class A0506개념02_변수두개로교환방법 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		// 임시 변수 c와 d에 각각 a와 b의 값을 저장합니다.
		int c = a;
		int d = b;
		
		// 저장한 값을 교환하여 대입합니다.
		a = d;
		b = c;
		System.out.println(a);
		System.out.println(b);
		
	}
}
