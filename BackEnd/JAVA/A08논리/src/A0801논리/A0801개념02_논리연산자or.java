package A0801논리;

/*
	[||(or) 연산자]
	|| 연산자는 양쪽 비교 연산자의 결과 중에 한 쪽만 참(true)이어도 참(true)을 반환합니다.
	예를 들어 정수 12의 경우 [짝수 or 3의배수]와 같이 || 연산자로 연결했을 때 
	짝수이기도 하고 3의 배수이기도 하기 때문에 그 결과는 참(true)입니다.
	정수 15의 경우 [짝수 or 3의 배수]와 같이 || 연산자로 연결했을 때 
	짝수이기는 하나 3의 배수가 아니지만, || 연산자의 경우 한 쪽만 참(true)이어도 그 결과는 참(true)이기 때문에 
	최종 결과는 참(true)입니다.
 */

public class A0801개념02_논리연산자or {
	public static void main(String[] args) {
		
		System.out.println(10 == 10 || 3 == 3);		// true  || true	=> true
		System.out.println(10 != 10 || 3 == 3);		// false || true	=> true
		System.out.println(10 == 10 || 3 != 3);		// true  || false	=> true
		System.out.println(10 != 10 || 3 != 3);		// false || false	=> false
		
	}
}
