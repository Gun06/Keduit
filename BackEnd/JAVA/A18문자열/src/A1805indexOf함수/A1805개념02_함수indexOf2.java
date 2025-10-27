package A1805indexOf함수;

public class A1805개념02_함수indexOf2 {
	public static void main(String[] args) {
		
		/*
	        [개념] 문자열 인덱스
	            (1) indexOf("문자열")
	            (2) 인자로 전달된 문자열과 일치하는 첫 번째 인덱스를 반환한다.
	            (3) 일치하는 값이 없으면 -1을 반환한다.
	            (4) 대소문자를 구분한다.
	            (5) 공백도 특수문자들도전부 문자열로취급된다.
	    */
		 	String text = "Hello, JavaScript!";

	        String word = "J";
	        int index = text.indexOf(word);
	        
	        if(index == -1) {
	        	System.out.println("해당 문자는 존재하지 않습니다.");
	        }else {
	        	System.out.println(index);
	        }
	}
}
