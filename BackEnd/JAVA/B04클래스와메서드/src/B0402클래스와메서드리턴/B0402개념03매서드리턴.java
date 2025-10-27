package B0402클래스와메서드리턴;

class TestReturn3 {
	int num;			// 1 ~ 10
	
	// 자바 디자인패턴 (setter, getter 메서드)
	// set메서드 : 변수 num에 값을 저장
	void setNum(int num) {
		this.num = num;
	}
	// get메서드 : 변수 num의 값을 반환(return)
	int getNum() {
		return num;
	}
}

public class B0402개념03매서드리턴 {
	public static void main(String[] args) {
		
		System.out.println("리턴을 사용하는경우와 안하는경우 ");
		
		TestReturn3 t1 = new TestReturn3();
		t1.setNum(10);
		
		//1) 사용하는경우
		System.out.println("1) 사용하는경우");
		int num1 = t1.getNum();
		System.out.println(num1);
		
		//2) 사용안하는경우
		System.out.println("2) 사용안하는경우");
		int num2 = t1.num;
		System.out.println(num2);
		
	}
}
