package A0503변수와평균_개념연습;
/*
[문제]
5875의 각각의 자릿수의 평균을 구하시오.
*/

/*
[출력예시]
6.25
*/
public class A0503개념연습05 {
	public static void main(String[] args) {
		int a = 5875;
	    int _1000 = a / 1000;
	    int _100 = a % 1000 / 100;
	    int _10 = a % 100 / 10;
	    int _1 = a % 10;
	    double total = _1000 + _100 + _10 + _1;
	    double avg = total / 4;
	   System.out.println(String.format("%.2f", avg));
	}
}
