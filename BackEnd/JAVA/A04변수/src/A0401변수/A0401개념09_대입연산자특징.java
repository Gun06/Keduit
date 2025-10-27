package A0401변수;
/*
	[대입 연산자 =]
		변수는 오직 대입 연산자를 통해서만이 값의 변경이 가능하다.
*/
public class A0401개념09_대입연산자특징 {
	public static void main(String[] args) {
		
		// 문제) x에 1을 더해보자.
		
		int x = 8;		
		System.out.println(x + 1);		// 9
		
		// 위 식을 통해 값 1이 추가된 것처럼 보이지만
		// 실제 x의 값은 8로 변함이 없다.
		System.out.println(x);			// 8
		
		
		// 아래와같이 대입연산자를 사용해서 9를 저장해야 값이 변경된다.
		int y = 8;
		y = y + 1;
		System.out.println(y);
		
	}
}
