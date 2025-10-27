package B0803상속과다형성;

class Test05_1{	}

class Test05_2 extends Object{		
	int a;
	int b;
	
	// 부모에 toString 이 있는지 확인하는 키워드(어노테이션)이라고한다.
	// 생략가능 
	@Override
	public String toString() {
		return a + ", " + b;
	}
	
	public void print() {
		System.out.println(a + " , " + b);
	}
	
	// 부모에 없는 메소드 위에 붙여보면 에러가난다.
	//@Override 
	//void test() {}
	
}
public class B0803개념02_toString {
	public static void main(String[] args) {
		
		Test05_1 a = new Test05_1();
		System.out.println(a.toString());
		System.out.println(a);
		
		Test05_2 b = new Test05_2();
		System.out.println(b);
		b.print();
	}
}
