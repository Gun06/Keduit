package A0505누적;

/*
	[누적과 대입 연산자]
	변수의 값을 변경하려면 대입 연산자(=)를 사용해야 합니다.
	a + 1은 9가 출력되지만, 이는 계산 결과일 뿐 변수 a의 값이 변경된 것은 아닙니다.
	대입 연산자를 사용하지 않았기 때문에 a의 값은 여전히 8입니다.
 */

public class A0505개념02_누적과대입연산자 {
	public static void main(String[] args) {
		
		int a = 10;
		System.out.println(a + 1);
		System.out.println(a);

		/*
			변수 b의 경우, 대입 연산자를 사용하여 변수 b에 1을 더한 값을 다시 b에 저장합니다. 
			이렇게 하면 b의 값이 실제로 변경되어 21이 됩니다.		 
		 */
		int b = 20;
		b = b + 1;
		System.out.println(b);
		
	}
}
