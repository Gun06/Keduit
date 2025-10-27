package A0406변수와소괄호;
/*
	[변수와 소괄호 연습]
	다음 보기1의 값을 변수로 설정하고, 보기2의 계산식 결과를 출력해 보겠습니다.
	
	[보기1]
	a = 5
	b = 3
	c = 9
	d = 2
	[보기2]
	(a + b) * c - d
	a - b * (c + d)
	(a + b) / c - d
	a - b / (c + d)
	(a + b) % c - d
	a - b % (c + d)
 */
public class A0406개념01_변수와소괄호연습 {
	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		int c = 9;
		int d = 2;
		
		int e = (a + b) * c - d;
		System.out.println(e);
		
		e = a - b * (c + d);
		System.out.println(e);
		
		e = (a + b) / c - d;
		System.out.println(e);
		
		e = a - b / (c + d);
		System.out.println(e);
		
		e = (a + b) % c - d;
		System.out.println(e);
		
		e = a + b % (c + d);
		System.out.println(e);
	}
}
