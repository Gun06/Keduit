package A1801문자열;

public class A1801개념02_char배열 {
	public static void main(String[] args) {
		
		/*
		  	문자는 특성상 여러글자를 저장하는 것이 목표이기때문에 	  	
		  	char[] 배열을 사용해야한다.
		 
		 */
		
		char[] str = {'a' , 'b' , 'c' , 'd' , 'e'};
		for(int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		char[] name = {'김' , '철' , '수'};
		
		for(int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		
	}
}
