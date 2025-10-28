package A0407변수와실수_문제;
/*
[문제]
길이가 4/9m인 끈을 모두 사용하여 정삼각형 한 개를 만들었습니다. 
이 정삼각형 한 변의 길이를 계산하여 소수점 두 자리까지 출력하시오.        
*/

/*
[출력예시]
0.15
*/
public class A0407문제13 {
	public static void main(String[] args) {
		double a = 4.0 / 9;
		double b = a / 3;
		
		System.out.println(String.format("%.2f", b));
	}
}
