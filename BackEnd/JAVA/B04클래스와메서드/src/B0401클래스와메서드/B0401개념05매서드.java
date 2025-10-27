package B0401클래스와메서드;

class Test05 {
	// 여기 a는 main a와 이름이 같아도 아무 상관없다.
	void setValue(int a) {
		System.out.println("sv : " + a);
		a = 100;
		
		System.out.println("sv : " + a);
	}
}

public class B0401개념05매서드 {
	public static void main(String[] args) {
		
		int a = 56;
		Test05 t1 = new Test05();
		
		// 매서드는 값을 복사하는것이기 떄문에 main안의 a에 영향이 없다.
		t1.setValue(a);
		
		System.out.println("--------------");
		System.out.println(a);
		
		System.out.println("--------------");
	
		// 아래 예제와 같은 상황이다.
		int b = 20;
		int c = b;
		c = 100;
		System.out.println(b);
		
	}
}
