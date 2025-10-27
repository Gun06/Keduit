package B0401클래스와메서드;

/*
	# 메서드 기본구조
	(1) 정의
		1) void					: 키워드
		2) setNums				: 이름
		3) (int a , int b )		: 전달된 값을 저장하는 변수(매개변수, parameter)
		3) { 기능 }				: 실행되는 영역
	(2) 사용법
		1) test1.setNums(10, 20);
		2) test1				: 클래스 변수명
		3) .setNums				: .메서드명
		4) (10, 20);			: (전달할 값); (인자, argument)
*/
 
class Test03 {
	int num1;
	int num2;
	
	void setNums(int a , int b) {
		num1 = a;
		num2 = b;
	}
	void printNums() {
		System.out.println(num1 + " " + num2);
	}
}

public class B0401개념03매서드 {
	public static void main(String[] args) {
		
		// 아래와같이 같을 저장해서 출력 할수도있지만.
		// 메서드를 만들어서 사용할수도있다.
		Test03 test1 = new Test03();
		test1.num1 = 10;
		test1.num2 = 20;
		System.out.println(test1.num1 + " " + test1.num2);
			
		Test03 test2 = new Test03();
		test2.setNums(10, 20);
		test2.printNums();
	}
}