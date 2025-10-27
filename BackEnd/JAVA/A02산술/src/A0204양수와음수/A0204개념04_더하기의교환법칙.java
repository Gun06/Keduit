package A0204양수와음수;
/*
	[교환법칙]
	교환법칙이란 숫자의 자리를 바꾸어 연산을 해도 결과가 동일한 것을 의미합니다.
	이 법칙은 더하기와 곱하기에만 적용됩니다.
	
	[더하기의 교환법칙]
	더하기의 경우, 숫자의 순서를 바꾸어도 결과가 같습니다.
	예를 들어, 3 + 5와 5 + 3은 둘 다 8이므로, 더하기의 교환법칙이 성립합니다.
 */
public class A0204개념04_더하기의교환법칙 {
	public static void main(String[] args) {

		System.out.println(3 + 5);       
		System.out.println(5 + 3); 
		
		System.out.println(3 + -5);       
		System.out.println(-5 + 3); 
		      
		System.out.println(-3 + -5);      
		System.out.println(-5 + -3);     
	}
}
