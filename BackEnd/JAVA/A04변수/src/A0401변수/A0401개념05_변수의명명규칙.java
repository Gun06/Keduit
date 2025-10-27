package A0401변수;
/*
# 변수의 명명규칙
	1. 숫자로 시작할 수 없다.
	2. 특수문자는 _, $ 만을 허용한다.
	3. 예약어(키워드)는 사용할 수 없다. (자바예약어.PNG)
		예) public, class, static, void, ...
	4. 자바는 알파벳의 대소문자를 구분한다.
*/
public class A0401개념05_변수의명명규칙 {
	public static void main(String[] args) {
		
				// 변수는 대소문자를 구분한다.
				// 아래는 서로 다른 변수이다.
				int test = 1;
				int Test = 2;
				System.out.println(test);
				System.out.println(Test);
				
				
				// 특수문자 $ 사용가능
				int $money = 1000;
				// 특수만자 _ 사용가능
				int _money = 2000;
				System.out.println($money);
				System.out.println(_money);
				
				// 아래와 같이 노란색 경고는 사소한 경고로 신경쓰지 않아도 된다.
				int math_score = 35;	// 스네이크 표기법 : 두번째 단어를 _ 로 구분하는 것
				int mathScore = 87;		// 카멜 표기법 : 소문자로 시작해 두번째 단어 첫글자를 대문자로 구분하는 것
				
				// int 1num = 10;		// 숫자로 시작할 수 없다.
				// int #test = 20;		// 특수기호 대부분은 사용이 불가하다.
				// int void = 30;		// 예약어는 사용할 수 없다.
	}
}
