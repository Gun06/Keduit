package A1802인덱싱_개념연습;

public class A1802개념연습04 {

	public static void main(String[] args) {
		/*
	        [문제]
	            철수는 비밀번호는 아래와 같다. 
	            철수는 비밀번호를 보호하기 위해 비밀번호 글자 사이사이에 
	            알파벳을 a부터 순서대로 끼워넣었다.
	            철수가 만든 비밀번호를 만들어보시오.
	        [정답]
	            qawbecrd1e2f3g4h
	    */
	
	    String password = "qwer1234";
	    String sample = "abcdefghijklmnopqrstuvwxyz";
	
	    String newPassword = "";
	    for(int i=0; i<password.length(); i++) {
	        newPassword += password.charAt(i);
	        newPassword += sample.charAt(i);
	    }
	    
	    System.out.println(newPassword);

	}

}
