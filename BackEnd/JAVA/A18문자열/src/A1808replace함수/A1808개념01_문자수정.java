package A1808replace함수;


public class A1808개념01_문자수정 {
	public static void main(String[] args) {
		
		/*
		 	문자를 수정할때 직접변경은 불가능하다.
		  	[예시]
		  		c 를 k로 변경
		 */
			String str = "abcde";
			
			//str.charAt(2) = 'k'; //에러가 발생한다.
			
			
		/*
		 	반드시 다시 저장해야 적용된다.
		 	변수 = replace("기존단어","대체단어");
		  	
		*/
			String str1 = "Hello Java! Java!";
			str1 = str1.replace("Java", "JSP");
			System.out.println(str1);
			
		
		
		
	}
}
