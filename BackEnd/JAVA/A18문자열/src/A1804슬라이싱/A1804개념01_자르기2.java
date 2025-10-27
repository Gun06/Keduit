package A1804슬라이싱;

public class A1804개념01_자르기2 {

	public static void main(String[] args) {
		/*
	        [개념] 문자열 자르기
	            String 변수 = "문자열";
	            
	            [1] 변수 = 변수.substring(시작인덱스, 마지막인덱스 - 1);
	                특정 구간의 문자열을 잘라준다.
	
	            [2] 변수 = 변수.substring(시작인덱스);
	                시작인덱스부터 문자열의 끝까지 잘라준다.           
	    */
	
	   
	    // 아래 문구에서 "s john"를 잘라내 출력하시오.
	    String test = "hi my name is john"; // 공백도 문자열의 한글자로 취급된다.
	    String rs2 = test.substring(12);
	    System.out.println(rs2);
	    
	   

	}

}
