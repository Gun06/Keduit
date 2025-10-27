package A0801논리;

/*
	[논리연산자 의미와 종류]
	논리 연산자는 비교 연산자 여러 개를 연결해주는 역할을 합니다.
	예를 들어 어떤 수가 짝수이면서 동시에 3의 배수인지 확인하고 싶을 때
	비교 연산자는 짝수를 판별하는 조건과 3의 배수를 판별하는 조건을 각각 설정할 수는 있으나
	이 두 조건을 모두 만족하는 식을 작성할 수는 없습니다. 이처럼 두 개 이상의 비교 연산식을
	하나로 연결해줄 때 논리 연산자를 사용하게 됩니다.
	이러한 논리 연산자는 &&(and), ||(or), !(not)이 있습니다. 
	
	[&&(and) 연산자]
	&& 연산자는 양쪽 비교 연산자의 결과가 모두 참(true)일 때만 참(true)을 반환하고,
	나머지는 모두 거짓(false)를 반환합니다. 예를 들어 정수 12의 경우 [짝수 and 3의배수]와 같이
	&& 연산자로 연결했을 때 짝수이면서 3의 배수이기 때문에 그 결과는 참(true)입니다.
	반면 정수 15의 경우 [짝수 and 3의 배수]와 같이 and 연산자로 연결했을 때 짝수 조건에서 
	거짓(false)이 되어 그 결과는 거짓(false)입니다.
 */

public class A0801개념01_논리연산자and {
	public static void main(String[] args) {
		
		System.out.println(10 == 10 && 3 == 3);		// true  && true	=> true
		System.out.println(10 != 10 && 3 == 3);		// false && true	=> false
		System.out.println(10 == 10 && 3 != 3);		// true  && false	=> false
		System.out.println(10 != 10 && 3 != 3);		// false && false	=> false
		
	}
}
