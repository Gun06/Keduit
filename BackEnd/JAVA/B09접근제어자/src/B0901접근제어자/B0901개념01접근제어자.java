package B0901접근제어자;
class Test01 {
	// 접근제어자 : public, protected(추후 설명), default, private
	private int a;
	private int b;
	
	// 접근제어가 없는 것을 default 라고 부른다.
	// 지금까지는 접근제어자를 사용하지 않았지만, 정확하게 명시해주는 것이 좋다.
	// 이제부터 아무것도 안적는것은 권장하지않는다. 
	int c;
	
	// public은 어느 클래스에서도 접근가능한 것
	public int d;

	public void setA(int a) {
		this.a = a;
	}
	
}

public class B0901개념01접근제어자 {
	public static void main(String[] args) {		
		// private 으로 선언하면 다른곳에 사용이 불가능하다. 
		Test01 t1 = new Test01();
		//t1.a = 10;
		
		//t1.setA(10);
		//t1.
	}
}
