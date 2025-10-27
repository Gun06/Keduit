package A1803비교;

public class A1803개념02_함수compareTo {

	public static void main(String[] args) {
		 /*
	        문자열도 내부적으론 숫자로 되어있기 때문에 대소비교가가능하다.
	        
	        a.compareTo(b); 
	      	
	       	위와같이 사용하며, 결과는 음수 , 양수 , 0 이 나오게된다.  
	    */
		
		String a = "가나다";
		String b = "나다라";
		
		int result1 = a.compareTo(b);
		System.out.println(result1);  // 음수이면 a가 더작다는 뜻이다.
		
		int result2 = b.compareTo(a);
		System.out.println(result2); //  양수이면 b가 더크다는 뜻이다.
		
		String c = "김철수";
		String d = "김철수";
		
		int result3 = c.compareTo(d);
		System.out.println(result3);  // 0 이면 서로 같다는 뜻이다. 

	}

}
