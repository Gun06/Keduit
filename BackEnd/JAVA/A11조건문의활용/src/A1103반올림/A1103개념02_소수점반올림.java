package A1103반올림;

/*
	[소수점 반올림]
	소수점 반올림 소수점 반올림은 먼저 정수로 만든다.
	예를들어 10.72이면 100을 곱해서 1072를 만든다.
	일의 자리를 반올림한다.
	1072는 1070 으로 변한다.
	다시원래의 숫자로 돌리기위해 100으로 나눈다.
	1070 은 10.7
 */

/*
	[출력예시]
	10.72
	10.7
 */

public class A1103개념02_소수점반올림 {
	public static void main(String[] args) {
		
		double a = 10.72;
		
		a = a * 100;
		int b = (int)a; // 정수로 변환했기때문에 형변환을 해야한다.
		System.out.println(b); // 1072
		
		int c = b / 10;  // 107
		int d = b % 10;  // 2
		
		if(d >= 5) {     // 여기 조건을 충족하지않아 아무일도안생긴다.  
			c += 1;     
		}
		
		double e = c * 10;  // 1070
		System.out.println(e);
		e /= 100;           // 10.70
		
		System.out.println(e); // 10.7
		
	}
}
