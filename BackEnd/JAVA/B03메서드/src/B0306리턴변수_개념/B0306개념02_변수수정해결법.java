package B0306리턴변수_개념;

public class B0306개념02_변수수정해결법 {
	
	/*
	  	[리턴함수 만드는법]
	  		(1) 기존의 void 를 int 로 변경한다.
	  		(2) 내부에서 return int; 를한다.
	  		(3) 보통 get이라는 단어를 앞에 붙여 리턴함수인걸 표시한다.
	 
	 */
	public static int get200() {
		int b = 200;
		return b;
	}
	
	public static void main(String[] args) {	
		int b = 100;
		System.out.println("리턴전:" + b);
		// 리턴함수는 결과가 있기때문에 void 함수와 달리 = 을 사용해서 저장해야한다.
		b = get200();
		System.out.println("리턴후:" + b);
	}
}
