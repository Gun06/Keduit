package A0701비교와자릿수;

/*
	[비교와 자릿수 연습]
	두 숫자 a = 543123과 b = 788872가 있습니다. 
	각각의 자리별로 다음 연산자를 사용하여 비교하고, 결과를 예측하시오.
	>  <  ==  !=  >=  <=
 */

public class A0701개념01_비교와자릿수연습 {
	public static void main(String[] args) {
		
		int a = 543123;
		int b = 788872;

		boolean c = a / 100000 > b / 100000;
		boolean d = a % 100000 / 10000 < b % 100000 / 10000;
		boolean e = a % 10000 / 1000 == b % 10000 / 1000;
		boolean f = a % 1000 / 100 != b % 1000 / 100;
		boolean g = a % 100 / 10 >= b % 100 / 10;
		boolean h = a % 10 <= b % 10;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
	}
}
