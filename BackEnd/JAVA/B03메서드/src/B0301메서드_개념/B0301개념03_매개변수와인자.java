package B0301메서드_개념;

public class B0301개념03_매개변수와인자 {

	public static void plus(int x , int y) {
		int result = x + y;
		System.out.println(x + " " + y + " " + result);
	}
	
	public static void main(String[] args) {
		/*
		  	[함수의 활용법]
		  		기존의 한페이지 안에 모든걸 작성할때와는 달리, 
		  		함수를 사용하면 더욱더 코드의 재활용성이 높아진다.
		  		특히, 함수의 매개변수와 인자를 사용하여 그효과를 증가시킨다. 	 
		 */	
		/*
		  	[1] 매개변수
			  	1) 함수의 () 소괄호 안에 변수를 작성할수있고, 이를 '매개변수' 라한다. 
			  	2) 개수에는 제한이 없다. 
		 	[2] 인자
			 	1) 함수에 전달하는 값 을 '인자' 라고 한다. 
			 	2) 함수의 매개변수와 같은 개수와 같은 타입으로 전달해야한다.
		 */
		plus(10 , 3);
		plus(60 , 3);
	}

}
