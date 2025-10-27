package A1804슬라이싱_개념연습;

public class A1804개념연습01 {

	public static void main(String[] args) {
		 /*
	        [문제]
	            score배열의 각 점수를 /(슬러시)를 구분자로 
	            하나의 문자열로 연결하고 출력하시오.
	        [정답]
	            str = 11/100/89
	    */
	
	    int[] arr = {11, 100, 89};
	    String str = "";
	
	    for(int i=0; i<arr.length; i++) {
	        str += arr[i];
	        str += "/";
	    }
	    System.out.println(str);
	    str = str.substring(0, str.length() - 1); // 마지막글자 / 는 잘라준다.
	    System.out.println(str);
	}

}
