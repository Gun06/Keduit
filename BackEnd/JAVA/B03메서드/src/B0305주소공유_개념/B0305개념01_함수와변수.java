package B0305주소공유_개념;


public class B0305개념01_함수와변수 {
	/*
	    [개념] 함수와 변수
	        함수 밖에서 선언한 변수 a와 
	        함수의 매개변수인 a는 서로 다른 변수이다. 
	*/
	public static void solution(int a) {
		a = 20;
	}
	
	public static void main(String[] args) {
		int a = 10;
		System.out.println("함수호출전:" + a);
		solution(a);
		System.out.println("함수호출후:" + a);
		
	}
}
