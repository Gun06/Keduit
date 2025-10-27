package A0405변수와혼합계산_개념연습;
/*
[문제]
다음 보기1의 값을 변수로 설정하고, 보기2의 계산식 결과를 출력하시오.

[보기1]
a = 5
b = 3
c = 9
d = 2
[보기2]
a + b * c - d
a - b * c + d
a + (b / c - d
a - b / c + d
a + b % c - d
a - b % c + d
*/

public class A0405개념연습02 {
	public static void main(String[] args) {
		 int a = 5;
		    int b = 3;
		    int c = 9;
		    int d = 2;

		    int e = a + b * c - d;
		    System.out.println(e);

		    e = a - b * c + d;
		    System.out.println(e);

		    e = a + b / c - d;
		    System.out.println(e);

		    e = a - b / c + d;
		    System.out.println(e);

		    e = a + b % c - d;
		    System.out.println(e);

		    e = a + b % c + d;
		    System.out.println(e);
	}
}
