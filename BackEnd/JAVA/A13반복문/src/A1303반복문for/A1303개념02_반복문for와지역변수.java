package A1303반복문for;

/*
	[반복문 for와 지역변수]
		반복문의 for안의 int i = 0; 은 지역변수로써 for가 종료될때 같이 소멸한다.
 */

public class A1303개념02_반복문for와지역변수 {
	public static void main(String[] args) {
		
		
		for(int i=0; i<11; i++) {
			System.out.print(i + " ");
		}
			
		int i = 10; // 다시 재선언가능하다. 
			
	}
}
