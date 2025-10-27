package A0207실수;
/*
	[소수점 자리수 표현 함수] 
	String.format(1번, 2번);
	
	[1번자리] 에는 자리수 표현을 위한 문자를 적는다. 
	[예시]
		"%.0f" 은 소수점0자리까지표현
		"%.1f" 은 소수점1자리까지표현
		"%.2f" 은 소수점2자리까지표현
	
	[2번자리]에는 소수점숫자를 넣는다. 

*/
public class A0207개념01_소수점의자리수표현함수 {
	public static void main(String[] args) {
		
		System.out.println(String.format("%.0f", 3.3333));
		System.out.println(String.format("%.1f", 3.3333));
		System.out.println(String.format("%.2f", 3.3333));
		System.out.println(String.format("%.3f", 3.3333));
	}
}
