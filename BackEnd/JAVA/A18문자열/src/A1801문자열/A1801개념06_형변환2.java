package A1801문자열;

/*
	String.valueOf();
	
	숫자를 문자열로 변경해준다. 
*/

public class A1801개념06_형변환2 {
	public static void main(String[] args) {
		
		
		int num = 10;
		String strNum = String.valueOf(num);
		System.out.println(strNum + 1); // 101 => 문자열로 변환된것을 알수있다. 
		
		
		double num2 = 10.3;
		String strNum2 = String.valueOf(num2);
		System.out.println(strNum2 + 1); // 10.31 => 문자열로 변환된것을 알수있다. 
		
		char a = '가';
		String strChar = String.valueOf(a);
		System.out.println(strChar + "나"); // 가나 => 문자열로 변환된것을 알수있다. 
		
		
		/*
		  	[꼼수]
		 		형변환 우선순위로 인해 숫자는 문자열보다 우선순위가 낮다. 
		 		+ 연결연산자를 통해 자동형변환을 시킬수있다. 
		 		
		 */
		
		int num3 = 13;
		String strNum3 = num3 + ""; // 문자열이 숫자보다 우선순위가 높기때문에 자동형변환이 적용된다.
		System.out.println(strNum3 + 1); // 131 => 문자열로 변환된것을 알수있다. 
	}
}
