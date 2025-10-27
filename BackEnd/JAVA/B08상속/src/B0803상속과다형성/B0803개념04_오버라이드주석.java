package B0803상속과다형성;

// [super]
// -상속받은 자식클래스에서 부모의 자원을 사용할때 사용함.
class Test07{	
	int num;
	String name;
	
	Test07(int num, String name){
		this.num = num;
		this.name = name;
	}
}

class Test07Child extends Test07{
	int score;	
	
	Test07Child(int num , String name , int score){
		super(num , name); // 부모의 생성자호출하는법 ()만붙여주면된다.
		this.score = score;
	}
	
	@Override
	public String toString() {
		return num + " : " + name + " : " + score;
	}
}

class Super {
	public Super() {
		System.out.println("부모");
	}
}

class Sub extends Super {
	public Sub() {
		//super();	// 생략가능(부모 생성자 호출)
		System.out.println("자식");
	}
}

public class B0803개념04_오버라이드주석 {
	public static void main(String[] args) {
		
		Sub s = new Sub();
		
		Test07Child t7 = new Test07Child(1001, "이만수", 23);
		System.out.println(t7/* .toString() */);
		
	}
}









