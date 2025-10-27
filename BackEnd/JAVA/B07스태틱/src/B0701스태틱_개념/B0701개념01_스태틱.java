package B0701스태틱_개념;


class Test01 {
								
	int a;				
	static int b;		
	
	static void test() {
		System.out.println("test()");
	}
}

public class B0701개념01_스태틱 {
	public static void main(String[] args) {
		
		Test01.b = 10;
		System.out.println(Test01.b);
		Test01.test();
		
		Test01 t1 = new Test01();
		Test01 t2 = new Test01();
		
		t1.b = 20;
		t2.b = 100;
		
		System.out.println(t1.b);
		System.out.println(Test01.b);
		
		
	}
}




