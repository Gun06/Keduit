package B1205맵_개념;

class TestP{
	int a;
}
class TestC extends TestP{
	int b;
}

public class B1205개념01_형변환 {
	public static void main(String[] args) {
		
		TestP p = new TestP();
		TestC c = new TestC();
		
		TestP p2 = new TestC();
		// TestC c2 = new TestP(); // 당연히 안된다.
		
	}
}
