package B0402클래스와메서드리턴;

class TestReturn1 {
	
	void 메서드명()		// 메서드의 선언부 
	{
						// 메서드의 구현부
		return;			// return 메서드 종료, void일 경우에는 return생략가능
	}
	
	void loop1() {
		/*
			i = 0	loop1 ==> i : 0
			i = 1	loop1 ==> i : 1
			i = 2	loop1 ==> i : 2
			i = 3	loop1 ==> i : 3
			i = 4	loop1 ==> i : 4
			i = 5	종료
			여기출력 loop1
		 */
		for(int i =0; i < 10; i++) {
			if(i == 5) {
				System.out.println("종료");
				 // for문 강제 종료
				 break; 			
			}
			System.out.println("loop1 ==> i : " + i);
		}
		System.out.println("여기출력 loop1");
	}
	
	void loop2() {
		/*
			i = 0	loop2 ==> i : 0
			i = 1	loop2 ==> i : 1
			i = 2	loop2 ==> i : 2
			i = 3	loop2 ==> i : 3
			i = 4	loop2 ==> i : 4
			i = 5	종료
		 */
		for(int i =0; i < 10; i++) {
			if(i == 5) {
				System.out.println("종료");
				// 메서드 강제종료
				// 코드상에서 68번째 줄로 이동
				return;
			}
			System.out.println("loop2 ==> i : " + i);
		}
		System.out.println("여기출력 loop2");
	}
	
}

public class B0402개념01매서드리턴 {
	public static void main(String[] args) {
		
		// 보조 제어문 : break, continue
		
		// 보조 옵션 : return;
		// 1) 메서드를 종료시키는 보조제어문 
		//  특징) 마치 반복문의 break와 같다. 
		//      하지만 반복문 break는 반복문만 종료되고  return은 메서드 전체를 종료시킨다. 
		TestReturn1 t1 = new TestReturn1();
		
		t1.loop1();
		System.out.println("----------------------------------");
		
		t1.loop2();
		
	}
}
