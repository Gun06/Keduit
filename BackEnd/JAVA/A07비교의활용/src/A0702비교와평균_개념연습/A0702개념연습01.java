package A0702비교와평균_개념연습;
/*
[문제]
철수는 지난 중간고사에서 국어, 수학, 영어 과목으로 각각 94점, 32점, 56점을 받았습니다.
이번 기말고사에서는 국어, 수학, 영어 과목으로 87점, 65점, 30점을 받았습니다.
중간고사와 기말고사의 평균점수가 서로 같은지 확인하고, true 또는 false로 출력하시오.     
*/

/*
[출력예시]
60.666666666666664
60.666666666666664
true
*/
public class A0702개념연습01 {
	public static void main(String[] args) {
		  int a = 94 + 32 + 56;
		    int b = 87 + 65 + 30;
		    double c = (double)a / 3;
		    double d = (double)b / 3;
		    boolean e = c == d;   
		    System.out.println(c);
		    System.out.println(d);
		    System.out.println(e);
	}
}
