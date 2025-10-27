package A1102추가계산;

/*
	[변수초기화위치]
	아래 코드에서 변수 c는 조건문 내부에서만 정의되었지만,
	그 후에도 프로그램에서 접근할 수 있습니다.
	하지만 변수 a가 5 이상일 경우 if문이 실행되지 않아서
	변수 c는 정의되지 않고, System.out.println(c)에서 오류가 발생합니다.
	
	따라서 if문 안에서 정의된 변수를 if문 밖에서 안전하게 사용하려면,
	변수가 반드시 정의 되도록 미리 초기화하해야 합니다. 
	아래코드는 오류가 나며, 다음단원에서 해결하겠습니다.
 */

public class A1102개념03_변수초기화위치변경전 {
	public static void main(String[] args) {
		
		int a = 10;
		
		int b = 35;
		
		if(a < 5) {
			int c = b -  10;
		}
		// System.out.println(c);		// 오류 발생(c가 정의되지 않음)
		
	}
}
