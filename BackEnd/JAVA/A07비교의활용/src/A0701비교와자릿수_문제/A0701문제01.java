package A0701비교와자릿수_문제;
/*
[문제]
두 숫자 a = 876445 과 b = 654453 있습니다. 
각각의 자리별로 다음 연산자를 사용하여 비교하고, 결과를 예측하시오.
>  <  ==  !=  >=  <=    
*/

/*
[출력예시]
true
false
false
false
false
false    
*/
public class A0701문제01 {
	public static void main(String[] args) {
		int a = 876445;
		int b = 654453;
		
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
