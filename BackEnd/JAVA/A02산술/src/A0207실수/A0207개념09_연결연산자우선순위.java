package A0207실수;

public class A0207개념09_연결연산자우선순위 {
	public static void main(String[] args) {
		
		// 연산자우선순위에 의해서 103이 되어버린다. 
		// 이는 백삼 이된것이 아니라 문자로 변경된것이다.
		System.out.println("더하기 = " + 10 + 3);
		// 소괄호를 사용해서 해결한다.
		System.out.println("더하기 = " + (10 + 3));
		
		// 아래 예제는 주석을 풀면 에러가 발생한다. 
		// 연결연산자에의해 10이 문자가 되어버리기 때문에 - 는 사용할수없다.
		//System.out.println("빼기 = " + 10 - 3);
		
		// 빼기는 소괄호를 사용해서 해결한다.
		System.out.println("빼기 = " + (10 - 3));
		
		// 곱하기는 연결연산자보다 먼저 동작되기때문에 소괄호가 필요없다.
		System.out.println("곱하기 = " + 10 * 3);
		
		// 나누기도 위와 같은원리로 소괄호가 필요없다.
		System.out.println("나누기 = " + 10 / 3);
		
		// 나머지도 위와 같은원리로 소괄호가 필요없다.
		System.out.println("나머지 = " + 10 % 3);
	}
}
