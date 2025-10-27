package A0604비교와실수_개념연습;
/*
[문제]
철수는 아르바이트를 하고 있습니다. 
일반 수당은 한 시간에 9400원이며, 야근 수당은 일반 수당의 1.5배입니다. 
철수는 한 달 동안 열심히 일하여 일반 수당으로 일한 시간은 37시간이고,
야근 수당으로 일한 시간은 26시간입니다.
철수가 받은 일반 수당의 합과 야근 수당의 합이 서로 같은지 확인하고, true 또는 false로 출력하시오. 
*/

/*
[출력예시]
347800.00
366600.00
false
*/
public class A0604개념연습03 {
	public static void main(String[] args) {
		double a = 9400 * 37;
		double b = 9400 * 1.5 * 26;
		boolean c = a == b;
		System.out.println(String.format("%.2f", a));
		System.out.println(String.format("%.2f", b));
		System.out.println(c);
	}
}
