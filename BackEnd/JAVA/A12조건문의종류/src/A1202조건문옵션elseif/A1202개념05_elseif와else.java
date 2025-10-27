package A1202조건문옵션elseif;

/*
	[조건문 옵션 else if와 else]
	if에서 else if와 else를 한번에 사용 가능합니다.
	단, else는 문맥상 가장 마지막에만 사용할 수 있습니다.
	
	[문법]
	if(조건식1) {
	    조건식1이 참(true)일 때, 실행할 문장;
	} else if(조건식2) {
	    조건식1이 거짓(false)이고, 조건식2가 참(true)일 때 실행할 문장;  
	} else if(조건식3) {
	    조건식1,2가 거짓(false)이고, 조건식3이 참(true)일 때 실행할 문장; 
	} else {
	    위 조건식이 전부 거짓(false)일 때 실행할 문장;
 */

public class A1202개념05_elseif와else {
	public static void main(String[] args) {
		
		int a = 10;
		
		if(a == 11) {
			System.out.println("if(1)");
		} else if(a == 12) {
			System.out.println("else if(2)");
		} else if(a == 13) {
			System.out.println("else if(3)");
		} else {
			// 위 모든 식이 거짓이므로 else(4)만 출력됩니다.
			System.out.println("else(4)");
		}
		
	}
}
