package A1601배열;
/*
[배열과 문자열]
	자바에서는 문자열은 String[] 배열을 이용한다.
*/
public class A1601개념08배열의종류3 {
	public static void main(String[] args) {

		String[] strArr = {"김철수" , "mike" , "이만수" , "jake"};
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i] + " ");
		}
		
	}
}
