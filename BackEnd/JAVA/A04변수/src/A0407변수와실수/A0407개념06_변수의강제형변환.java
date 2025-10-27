package A0407변수와실수;
/*
	[강제형 변환]
		자동형변환은 우선순위가 높은 순서대로 형변환이된다. 
		(1) 프로그래밍을 하다보면 dobule 이 int로 변해야되는 상황이 발생되는데 그럴때는 강제형변환을 사용한다.	
		(2) 또는 처음에 변수에 저장할때는 int로 저장했으나 사용하다보니 double 로 변환해야할때는 강제 형변환을 사용한다.
		
	[방법]
		(자료형)변수
		예) (int)a; 
		예) (dobule)a;
			
	--------------------------------
		int c = 10;
		double d = 10.3; 
		c = c = (int)d;		

 */
public class A0407개념06_변수의강제형변환 {
	public static void main(String[] args) {

		// 강제 형변환 
				
		int c = 10;
		double d = 10.3;
	
		c = c + (int)d; // 자료형 앞에 변환하고싶은 자료형을 소괄호에 넣는다. 
		System.out.println(c);
		
		// [또다른 사용 예] 
		int x = 7;
		int y = 3;
		
		double z = x / y;   // 나누는 시점에서 이미 몫이 구해져 2가 되고 이를 자동형변환하면 2.0 이된다. 
		System.out.println(z);
		
		double z2 = (double)x / y; // 나누기전에 두변수중 한곳이상에 (double)을 사용해서 강제형변환을 해야한다. 
		System.out.println(z2);
	}
}
