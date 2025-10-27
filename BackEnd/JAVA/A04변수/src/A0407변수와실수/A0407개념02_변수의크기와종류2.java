package A0407변수와실수;

public class A0407개념02_변수의크기와종류2 {
	public static void main(String[] args) {
				
		// [실수] : float(작은 실수), double(큰 실수) (자바실수.PNG)
		System.out.println("[실수]");
		
		// 소수점은 최대한 정확히 표현하는 것이 좋기 때문에
		// float 보단 double을 사용한다.
		float c = 1.1234567891234F;		// float도 double과 구분을 위해 F를 붙여준다.
		double d = 1.1234567891234;		// double도 한계가 있지만 float 보단 큰 수를 저장할 수 있다.
		System.out.println(c);
		System.out.println(d);
		
	}
}



