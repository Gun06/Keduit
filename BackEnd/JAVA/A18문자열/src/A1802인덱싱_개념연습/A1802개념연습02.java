package A1802인덱싱_개념연습;

public class A1802개념연습02 {

	public static void main(String[] args) {
		/*
	        [문제]
	            아래 문자열을 한글자씩 순서대로 서로 비교하여, 같은글자수와 틀린글자수를 출력하시오.
	        [정답]
	            같은글자수=4
	            틀린글자수=1
	    */
		String text = "abcde";
	    String text2 = "abdde";
	    int count = 0;
	    int size= text.length();
	    for(int i = 0; i < size; i++){
	        if(text.charAt(i) == text2.charAt(i)){
	            count += 1;
	        }
	    }
	    System.out.println("같은글자수" + count);
	    System.out.println("틀린글자수" + (size - count));
	}

}
