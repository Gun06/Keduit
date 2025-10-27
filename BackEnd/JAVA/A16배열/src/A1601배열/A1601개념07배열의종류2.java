package A1601배열;
/*
[배열과 문자]
	char[] 배열은 한글자씩 저장가능하고 '' 홑따옴표를 사용한다.	
	char[] 배열은 너무 불편하다. 
	일반적으로 한사람의 이름 자체가 배열이기때문에 한명이상 저장할 수 없다.  
	
	그래서 String 자료형을 사용한다. 
	마치 int 변수처럼 사용가능하다.
	하지만 내부는 char[] 로 되어있다. 
	
	보통문자열은 char[]보다는 String 을 사용한다. 
*/
public class A1601개념07배열의종류2 {
	public static void main(String[] args) {

		char[] charArr = {'a' , 'b' , '가' , '나'};
		
		for(int i = 0; i < 4; i++) {
			System.out.print(charArr[i] + " ");
		}
		System.out.println();
		
		char[] charName = {'m' ,'i' , 'k' , 'e'}; 		
		for(int i = 0; i < 4; i++) {
			System.out.print(charName[i]);
		}
		System.out.println();
		
		String strName = "mike";
		
		System.out.println(strName);
		
	}
}
