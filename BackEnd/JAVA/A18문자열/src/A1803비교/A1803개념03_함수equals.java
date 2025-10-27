package A1803비교;

public class A1803개념03_함수equals {

	public static void main(String[] args) {
		 /*
	        문자열도 내부적으론 숫자로 되어있기 때문에 대소비교가가능하다.
	        
	        a.equals(b); 
	      	
	       	위와같이 사용하며, 결과는 true, false 가 나온다.
	       	비교연산자 == 과 같다. 
	       	
	    */
		
		String a = "가나다";
		String b = "나다라";	
		boolean result1 = a.equals(b);
		System.out.println(result1);  
		
		String c = "가나다";
		String d = "가나다";
		boolean result2 = c.equals(d);
		System.out.println(result2);  
	}

}
