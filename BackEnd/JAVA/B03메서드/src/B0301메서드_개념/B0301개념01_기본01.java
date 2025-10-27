package B0301메서드_개념;

public class B0301개념01_기본01 {

	public static void test() {
		System.out.println("test함수입니다.");
	}
	
	public static void main(String[] args) {
		/*
	        [개념] 함수의 기본 형태 
	            [1] 함수의 정의
	                (1) public static void : 키워드
	                (2) test()   : 이름
	                (3) {}       : 실행영역 
	            [2] 함수 실행 
	                (1) test();  : 함수이름을 적는다.
	            [3] 함수의 이점
	                (1) 함수를 한번만들어 놓으면 다시 사용할때는 코드량이 줄어든다.
	                
	           // 함수의 정의는 설계에 해당하는것으로 아직 실행되는것은아니고, 
	           // 직접 사용할때 실행된다.
		 */
			
		test();
		test();
	}

}
