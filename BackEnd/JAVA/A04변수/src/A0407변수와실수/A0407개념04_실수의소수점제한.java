package A0407변수와실수;
/*
	[소수점 자리수 표현 함수] 
	String.format(1번, 2번);
	
	[1번자리] 에는 자리수 표현을 위한 문자를 적는다. 
	[예시]
		"%.0f" 은 소수점0자리까지표현
		"%.1f" 은 소수점1자리까지표현
		"%.2f" 은 소수점2자리까지표현
	
	[2번자리]에는 double자료형 변수를 넣는다. 
 */
public class A0407개념04_실수의소수점제한 {
	public static void main(String[] args) {
		
		double a = 140.5;
		double b = 78.3;
		
		double c = a / b;
		System.out.println(c);	
		System.out.println(String.format("%.2f", c));
	}
}
