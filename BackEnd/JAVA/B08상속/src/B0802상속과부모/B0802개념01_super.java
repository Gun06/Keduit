package B0802상속과부모;

class Super1{
	int s;
}

class Child1 extends Super1{
	int a;
	
	void test(int a, int s) {
		this.a = 10;
		a = 10;
		
		s = 10;
		super.s = 20;
	}
}

public class B0802개념01_super {
	public static void main(String[] args) {
		
		
	}
}
