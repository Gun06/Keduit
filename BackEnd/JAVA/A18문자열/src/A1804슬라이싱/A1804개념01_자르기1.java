package A1804슬라이싱;

public class A1804개념01_자르기1 {

	public static void main(String[] args) {
		/*
	        [개념] 문자열 자르기
	            String 변수 = "문자열";
	            
	            [1] 변수 = 변수.substring(시작인덱스, 마지막인덱스 - 1);
	                특정 구간의 문자열을 잘라준다.
	
	           
	    */
	
	    // 아래 문구에서 "java"를 잘라내 출력하시오.
	    String text = "hello,javascript";
	    String rs1 = text.substring(6, 10); // 6 7 8 9
	    System.out.println(rs1);
	
	  

	}

}
