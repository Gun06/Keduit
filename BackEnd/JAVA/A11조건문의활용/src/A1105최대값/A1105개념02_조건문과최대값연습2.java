package A1105최대값;

/*
	[조건문과 최대값 연습2]
	숫자 557, 55, 856 사이에서,
	그 중 가장 큰 수(MAX)를 찾아 출력하시오.   
	
	비교할 변수를 하나 만들어서, 순차적으로 숫자를 비교하며 큰 값을 저장합니다. 
	이렇게 하면 복잡한 중복 조건 없이 간결하게 최대값을 찾을 수 있습니다.
 */

/*
	[출력예시]
	557 55 856
	856	
*/

public class A1105개념02_조건문과최대값연습2 {
	public static void main(String[] args) {
		
		int a = 557;
		int b = 55;
		int c = 856;
		System.out.println(a + " " + b + " " + c);
		
		// max를 가장 작은 값인 1로 설정합니다.
		int max = 1;
		
		// (1) max는 1 이고 557보다는 값이 작기 때문에 557을 저장합니다.
		if(max < a) {
			max = a;
		}
		// (2) max는 557 이고, 55보다 값이 크기 때문에 그냥 지나갑니다.
		if(max < b) {
			max = b;
		}
		// (3) max는 557 이고, 856보다 값이 작기 때문에 856을 저장합니다.
		if(max < c) {
			max = c;
		}
		System.out.println(max);
		
	}
}
