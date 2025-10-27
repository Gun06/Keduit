package A0501변수와자릿수;

/*
	[변수와 십의 자릿수]
	십의 자리를 구하려면 4128에서 천의 자리와 백의 자리를 제외한 나머지를 구합니다.
	이를 위해 4128을 100으로 나눈 나머지를 구하면 28이 됩니다. 
	이후 28을 10으로 나눈 몫을 구하면 십의 자리는 2입니다. 
 */

public class A0501개념03_변수와네자릿수의십의자리 {
	public static void main(String[] args) {
		
		int a = 4128;
		int b = a % 100 / 10;
		System.out.println(b);
		
	}
}
