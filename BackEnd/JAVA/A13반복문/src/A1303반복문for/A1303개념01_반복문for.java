package A1303반복문for;

/*
	[반복문 for]
	기존의 while 반복문은 초기식, 조건식, 증감식 세 가지 단계로 이루어져 있습니다.
	하지만 for문을 사용하면 이 세 단계를 한 줄로 간단하게 표현할 수 있습니다.
	
	[문법]
	for(초기식;조건식;증감식) {
	    실행할 문장;
	}
 */

public class A1303개념01_반복문for {
	public static void main(String[] args) {
		
		/*
			이제 기존의 while문과 새로 배운 for문을 사용하여
			0부터 10까지 출력해 보겠습니다.		
		 */
		
		// while문 사용
		int i = 0;
		while(i < 11) {
			System.out.print(i + " ");
			i += 1;
		}
		System.out.println();
		System.out.println("------------------------");
		
		// for문 사용
		for(int j=0; j<11; j++) {
			System.out.print(j + " ");
		}
	}
}
