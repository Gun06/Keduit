package A0405변수와혼합계산_문제;
/*
[문제]
다음 보기1의 값을 변수로 설정하고, 보기2의 계산식 결과를 출력하시오.

[보기1]
a = 12
b = 6
c = 9
[보기2]
a + b * c
a - b * c
a + b / c
a - b / c
a + b % c
a - b % c
*/

public class A0405문제01 {
	public static void main(String[] args) {
		int a =12;
		int b = 6;
		int c = 9;
		
		int d = a + b * c;
	    System.out.println(d);

	    d = a - b * c;
	    System.out.println(d);

	    d = a + b / c;
	    System.out.println(d);

	    d = a - b / c;
	    System.out.println(d);

	    d = a + b % c;
	    System.out.println(d);

	    d = a + b % c;
	    System.out.println(d);  
	}
}
