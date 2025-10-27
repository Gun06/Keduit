package A0202나누기와몫;
/*
	[나누기]			
		자바에서는 나누기는 몫으로 계산되며, 나누기를 표현할때는 소수점을 사용한다.
*/
public class A0202개념01_나누기와몫 {
	public static void main(String[] args) {
				
		// [몫] 정수는 소수점이 제거되어 정수로 표현된다.
		// 정수 / 정수 = 정수(몫)
		System.out.println(10 / 3); 
		
		// [나누기] 양쪽중 최소 한쪽에 소수점이 있어야 나누기가 적용된다.
		// 정수 / 실수 = 실수
		// 실수 / 정수 = 실수
		// 실수 / 실수 = 실수
		System.out.println(10.0 / 3);
		System.out.println(10 / 3.0);
		System.out.println(10.0 / 3.0);
	}
}
