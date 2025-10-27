package A1802인덱싱;


public class A1802개념05_연결연산자로수정 {
	public static void main(String[] args) {
		
		String str = "abcde";
		
		/*
		  	문자열은 더하기로 연결할수있다.
		 	
		 */
		/*
		 	[문제]
		 		c를 k로 수정하시오.
		 */
		String temp = "";
		for(int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			if(a == 'c') {
				temp += 'k';
			}else {
				temp += str.charAt(i);
			}
		}
		System.out.println(temp);
		
		
	}
}
