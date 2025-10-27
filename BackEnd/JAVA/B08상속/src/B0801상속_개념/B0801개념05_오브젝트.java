package B0801상속_개념;

class ExtendsTest1 extends Object {}
class ExtendsTest2 {}

class TestA /* extends Object */ {	
	int a;
}

public class B0801개념05_오브젝트 {
	public static void main(String[] args) {
		
		TestA a = new TestA();
			
		// 자바의 모든 클래스들은 자바에서 미리제공하는 Object 클래스를 내부적으로 자동으로 상속받게 되어있다. 
		// 변수에 .을 찍어보면 알수있다. 
		
		ExtendsTest1 t1 = new ExtendsTest1();
		ExtendsTest2 t2 = new ExtendsTest2();
		
		
		
		//t1.
		//t2.
		
	}
}
