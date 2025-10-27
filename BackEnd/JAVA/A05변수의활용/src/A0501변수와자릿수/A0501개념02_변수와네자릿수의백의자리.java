package A0501변수와자릿수;

/*
	[변수와 백의 자릿수]
	백의 자리를 구하려면 4128에서 천의 자리를 제외한 나머지를 구합니다.
	이를 위해 4128을 1000으로 나눈 나머지를 구하면 128이 됩니다. 
	이후 128을 100으로 나눈 몫을 구하면 백의 자리는 1입니다.
 */

public class A0501개념02_변수와네자릿수의백의자리 {
	public static void main(String[] args) {
		
		int a = 4128;
		int b = a % 1000 / 100;
		System.out.println(b);
		
	}
}
