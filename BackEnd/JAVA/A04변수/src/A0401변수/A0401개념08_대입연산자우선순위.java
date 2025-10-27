package A0401변수;
/*
[대입 연산자의 우선순위]
대입 연산자는 연산자들 중에서 우선순위가 가장 낮습니다.

[연산자 우선순위표]
(1) 소괄호 연산자  ()
(2) 산술 연산자    *  /  //  %
(3) 산술 연산자    +  -
(4) 대입 연산자    = 
 */
public class A0401개념08_대입연산자우선순위 {
	public static void main(String[] args) {
		
		int a;
		a = (20 + 6);
		System.out.println(a);
		
		// 대입 연산자가 왼쪽에 있기때문에 먼저 적용될꺼같지만,
		// 우선순위가 가장 늦게 적용되기 때문에 소괄호는 생략 가능합니다.
		int b = 10 + 3;
		System.out.println(b);
	}
}
