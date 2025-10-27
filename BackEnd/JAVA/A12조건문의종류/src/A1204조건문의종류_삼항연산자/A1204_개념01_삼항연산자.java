package A1204조건문의종류_삼항연산자;

public class A1204_개념01_삼항연산자 {
	public static void main(String[] args) {

		/*
			[삼항 연산자]
				if문을 한줄로 표시한 것이다.

				if(a == 10) {
					result = true;
				} else {
					result = false;
				}
				
				삼항연산자로 표시하면 
				result = a == 10 ? true : false;

			[1] ? 는 참이고,
			[2] : 은 거짓이다.

			[설명]
				삼항연산자는 익숙해지면 편리해서 자주사용하게된다. 반드시 익혀두자.
		*/

		int a = 10;
		
		boolean result = false;
		if(a == 10){
			result = true;
		} else {
			result = false;
		}
		System.out.println(result);

		result = a == 10 ?  true : false;
		System.out.println(result);

	}
}
