package B1101인터페이스_개념;

// 상속 , 추상화상속 , 인터페이스상속

class TestA{
	void test() {}
}
class TestB extends TestA{
	void test() {}
}

abstract class TestC{
	abstract void test();
	void test2() {}
}
class TestD extends TestC{
	@Override
	void test() {}
}

interface TestE {
	public void test();
	public void test2();

}
interface TestE2{
	public void test3();
}

class TestF implements TestE, TestE2{
	
	@Override
	public void test2() {}

	@Override
	public void test3() {}

	@Override
	public void test() {
		
		
	}
}

public class B1101개념01_인터페이스 {
	public static void main(String[] args) {
		
	}
}
