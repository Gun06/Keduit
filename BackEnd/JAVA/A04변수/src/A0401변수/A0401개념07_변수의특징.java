package A0401변수;
/*
# 변수의 특징
	1. 같은 이름의 변수를 또다시 선언할 수 없다.
	   (= int를 같은 이름에 두 번 사용 못 한다.)
	
*/
public class A0401개념07_변수의특징 {
	public static void main(String[] args) {
		
		int a = 10;
		
		// 아래 주석을 지우면 에러가 발생한다. 
		//int a = 20;
		
		// 재사용시는 아래와같이 int 를 제외하고 사용해야한다. 
		a = 20;
	}
}
