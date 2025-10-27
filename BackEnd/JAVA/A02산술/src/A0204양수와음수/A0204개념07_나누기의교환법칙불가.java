package A0204양수와음수;
/*
	[나누기의 교환법칙 불가]
	나누기의 경우, 숫자의 순서를 바꾸면 결과가 달라집니다.
	예를 들어, 5 / 3은 1.6666...이지만, 3 / 5는 0.6이 됩니다.
	이처럼 나누기는 숫자의 순서가 매우 중요하기 때문에, 교환법칙이 적용되지 않습니다.
 */
public class A0204개념07_나누기의교환법칙불가 {
	public static void main(String[] args) {

		// 나누기를 위해서는 한쪽에 소수점을 붙인다.
		System.out.println(3.0 / 5);       
		System.out.println(5 / 3.0); 
		
		System.out.println(3.0 / -5);       
		System.out.println(-5 / 3.0); 
		      
		System.out.println(-3.0 / -5);      
		System.out.println(-5 / -3.0);     
	}
}
