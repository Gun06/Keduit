package B0601캡슐화_개념;
class Test01 {
	
	int a;

	void setA(int a) {
		this.a = a;
	}
	int getA() {
		return a;
	}
}

public class B0601개념01_캡슐화 {
	public static void main(String[] args) {		
		
		Test01 t1 = new Test01();
		
		t1.a = 10;
		t1.setA(10);
		
		System.out.println(t1.a);
		System.out.println(t1.getA());
		
	}
}
