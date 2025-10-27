package A1801문자열;

/*
	# 형변환(type conversion)
		- 자료형(data type)을 바꾸는 것을 의미
	
	Integer.parseInt(); 	
		(1) 문자열을 정수로 변환해준다. 
	
	Double.parseDouble();
		(2) 문자열을 실수로 변환해준다.
	
	
*/

public class A1801개념05_형변환1 {
	public static void main(String[] args) {
		
		
		// 문자열 형변환하는 방법 : 특수함수를 사용해야한다.
		// * 문자열 -> 숫자
		String strNum = "10";
		int num = Integer.parseInt(strNum);
		System.out.println(num + 1);		// 11
		
		String strNum2 = "10.2";
		double num2 = Double.parseDouble(strNum2);
		System.out.println(num2 + 1);       // 12
		
		
		String strName = "김철수";
		// 아래 주석을 풀면 에러가 발생한다. 변환되는 내용이 숫자여야 변환된다. 
		//int num3 = Integer.parseInt(strName); 
		
		
		
	}
}
