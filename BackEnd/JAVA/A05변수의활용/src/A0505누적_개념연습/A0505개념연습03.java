package A0505누적_개념연습;
/*
[문제]
철수와 영희는 50000원을 가지고 있습니다. 
두 사람은 영화관에서 영화 한 편을 예매했습니다.
간식으로 팝콘 한 개를 구입한 후, 다시 콜라 두 개를 구입했습니다. 
보기를 참고하여 철수의 남은 돈을 계산하고, 각 지출 항목을 시간 순서대로 출력하시오.

[보기]
(1) 콜라 1개는 팝콘 1개보다 4000원 저렴합니다.
(2) 영화 1편의 가격은 12000원입니다.
(3) 팝콘의 가격은 영화 가격의 6/10입니다.        
*/

/*
[출력예시]
50000.0
26000.0
18800.0
12400.0       
*/
public class A0505개념연습03 {
	public static void main(String[] args) {
		double a = 50000;
	    double b = 12000 * 2;
	    double c = 12000 * 0.6;
	    double d = (c - 4000) * 2;
	    System.out.println(a);
	    a -= b;
	    System.out.println(a);

	    a -= c;
	    System.out.println(a);

	    a -= d;
	    System.out.println(a);

	}
}
