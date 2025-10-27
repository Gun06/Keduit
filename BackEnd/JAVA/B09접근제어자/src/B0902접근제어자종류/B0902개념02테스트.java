package B0902접근제어자종류;

public class B0902개념02테스트 {
	public static void main(String[] args) {
		
		B0902개념01접근제어자종류 t =new B0902개념01접근제어자종류();
		// t.a = 10; // private 은 내부 클래스 에서만 사용가능 	
		
		t.b = 10; // 같은패키지에 있으면 public 사용가능
		t.c = 20; // 같은패키지에 있으면 protected 사용가능
		t.d = 30; // 같은패키지에 있으면 default 사용가능
		
	}
}


