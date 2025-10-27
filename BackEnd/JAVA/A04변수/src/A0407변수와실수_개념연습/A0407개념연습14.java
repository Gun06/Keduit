package A0407변수와실수_개념연습;
/*
[문제]
길이가 5/8m인 끈을 모두 사용하여 정사각형 모양 한 개를 만들었습니다.
이 정사각형 한 변의 길이를 계산하여 소수점 두 자리까지 출력하시오.        
*/

/*
[출력예시]
0.16
*/
public class A0407개념연습14 {
	public static void main(String[] args) {
		double a = 5.0/ 8;
		double b = a / 4;
		
		System.out.println(String.format("%.2f", b));
		
	}
}
