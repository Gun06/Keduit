package B0903접근제어자종류2;

import B0902접근제어자종류.B0902개념01접근제어자종류;

// a 는 private 이므로 사용불가
// b 는 public 이므로 어느클래스에서나 사용가능
// c 는 protected 이므로 자식클래스인 Test클래스 내부에서만 사용가능 
// d 는 default 는 패키지가 달라지면 private 이므로 사용불가 (사용하지않는것이 좋다)

class L2_Child extends B0902개념01접근제어자종류{
	public L2_Child(){
		//a = 10; 	// a는 private 이므로 사용불가
		b = 10; 	// b는 public 이므로 사용가능
		c = 10; 	// c는 protected 이므로 자식클래스에서는 사용가능하다.
		//d = 10; 	// default 는 패키지가 달라지면 private 으로 변한다.(사용하지않는것이 좋다)
	}
}

public class B0903개념01테스트 {
	public static void main(String[] args) {
		
		L2_Child child = new L2_Child();
		child.b = 10; // b는 public 이므로 사용가능.
		// 여기서는 오직 b만 사용가능하다. 
		
	}
}
