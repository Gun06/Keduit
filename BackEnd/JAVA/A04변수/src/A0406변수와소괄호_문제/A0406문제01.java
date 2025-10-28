package A0406변수와소괄호_문제;
/*
[문제]
다음 보기1의 값을 변수로 설정하고, 보기2의 계산식 결과를 출력하시오.

[보기1]
a = 15
b = 6
c = 2
d = 9
[보기2]
(a + b) - c * d
a - (b + c) * d
(a + b) - (c / d)
a - (b + c) / d
(a + b) - c % d
a - (b + c) % d
*/
public class A0406문제01 {
	public static void main(String[] args) {
		int a = 15;
	    int b = 6;
	    int c = 2;
	    int d = 9;

	    int e = (a + b) - c * d;
	    System.out.println(e);

	     e = a - (b + c) * d;
	     System.out.println(e);

	     e = (a + b) - c / d;
	     System.out.println(e);

	     e = a - (b + c) / d;
	     System.out.println(e);
	     
	     e = (a + b) - c % d;
	     System.out.println(e);

	     e = a + (b + c) % d;
	     System.out.println(e);
	}
}
