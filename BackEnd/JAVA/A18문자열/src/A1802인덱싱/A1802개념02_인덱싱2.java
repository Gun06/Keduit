package A1802인덱싱;


public class A1802개념02_인덱싱2 {
	public static void main(String[] args) {
		
		String str = "itacademy";
	
		/*
	        [문제]
	            str 변수에서 가장 마지막 글자를 출력하시오.
	        [정답]
	            e
		 */
		char ch = str.charAt(str.length() - 1);
		// ch = str.charAt(8);
		System.out.println(ch);
	
	}
}
