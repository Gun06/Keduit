package A0503변수와평균_문제;
/*
[문제]
5875의 각각의 자릿수의 평균을 구하시오.
*/

/*
[출력예시]
6.25
*/
public class A0503문제05 {
	public static void main(String[] args) {
		int a = 5857;
		int b = a/1000;
		int c = a/1000%100;
		int d = a/100%10;
		int e = a%10;
		
		double total = b+c+d+e;
		double avg = total/4;
		System.out.println(String.format("%.2f", avg));
	}
}
