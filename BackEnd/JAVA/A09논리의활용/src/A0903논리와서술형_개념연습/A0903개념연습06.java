package A0903논리와서술형_개념연습;
/*
[문제]    
철수는 자격증 시험을 보았습니다. 
시험은 두 과목으로 합격기준은 평균 60점 이상이며 한 과목이라도 50점 미만이면 과락입니다.
철수는 한 과목은 95점, 또 다른 과목은 45점을 받았습니다.
합격인지 확인하고, true 또는 false로 출력하시오.    
*/

/*
[출력예시]
false    
*/
public class A0903개념연습06 {
	public static void main(String[] args) {
	    int a = 99;
	    int b = 49;
	    int c = a + b;
	    int d = c / 2;

	    boolean e = d >= 60 && a >= 50 && b >= 50 ;   
	    System.out.println(e);
	}
}
