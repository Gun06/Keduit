package B0401클래스와메서드;

class Calculation{
	double num1;
	double num2;
	double result;	
	
	// 매서드는 모두 독립공간이라서 갈색으로 표시된 변수들은 중복이되어도 전부 다른 변수이다.
	// double a, double b  은 4번이나 사용하지만 각각다른변수이다. 
	
	//		  매개변수 = parameter
	void plus() {
		System.out.println("this = " + this);
		
		// this는 생략가능하다.
		// this.result = this.num1 + this.num2;
		result = num1 + num2;
	}
	
	// 매개변수(parameter)
	void minus(double a , double b) {
		this.result = a - b;
	}
	void multiply(double a , double b) {
		result = a * b;
	}
	void division(double a , double b) {
		result = a / b;
	}
	void printResult() {
		System.out.println(/* this. */result);
	}
}


public class B0401개념04매서드 {
	public static void main(String[] args) {
		
		Calculation cal = new Calculation();
		System.out.println("cal = " + cal);
		
		double a = 10;
		double b = 3;
		
		// 메서드의 호출
		// cal.plus(a, b);		// 인자,인수 = arguments
		cal.num1 = a;
		cal.num2 = b;
		cal.plus();
		cal.printResult();
		
		cal.minus(a, b);	// 인자,인수(argument)
		cal.printResult();
		
		cal.multiply(a, b);
		cal.printResult();
		
		cal.division(a, b);
		cal.printResult();
		
	}
}
