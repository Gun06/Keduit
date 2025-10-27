package A1802인덱싱;


public class A1802개념03_인덱싱반복문 {
	public static void main(String[] args) {
		
		String str = "itacademy";
		
		/*
	        [문제]
	            str 변수에서 c만빼고 출력하시오.
	        [정답]
	            itaademy
	    */
		for(int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			if(a != 'c') {
				System.out.print(str.charAt(i)); 
			}
		}
		
		
	}
}
