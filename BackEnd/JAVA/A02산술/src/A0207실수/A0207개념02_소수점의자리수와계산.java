package A0207실수;

public class A0207개념02_소수점의자리수와계산 {
	public static void main(String[] args) {
			
		// 2번자리에 계산식을 넣으면된다. 
		System.out.println(String.format("%.0f", 3.3333  + 2.333));
		
		System.out.println(String.format("%.1f", 3.3333  + 2.333));
		
		System.out.println(String.format("%.2f", 3.3333  + 2.333));
		
		System.out.println(String.format("%.3f", 3.3333  + 2.333));
	}
}
