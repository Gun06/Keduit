package B0401클래스와메서드;

/*
	# 메서드 기본구조
	(1) 정의
		1) void			: 키워드
		2) testPrint()	: 이름
		3) { 기능 }		: 실행되는 영역
	(2) 사용법
		1) t1.testPrint();
		2) t1				: 클래스 변수명
		3) .testPrint()		: .메서드명();
*/

class Test01 {
	// 클래스
	// (1) 변수				: 속성
	int x;
	
	// (2) 메서드(method)		: 기능
	void testPrint() {
		System.out.println("나 불렀니?");
	
	}
}



public class B0401개념01매서드 {
	// main() 메서드는 가장 먼저 호출된다.
	public static void main(String[] args) {
		
		Test01 t = new Test01();
		t.x = 10;
		// 메서드의 호출
		t.testPrint();
		
		System.out.println("프로그램 종료");
	}
}

// 메서드1_개념01_기본이론1.main(null);
