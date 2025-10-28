package A0407변수와실수_문제;
/*
[문제]
철수는 전체 높이가 5.4cm인 화분에 담긴 식물을 선물받았습니다. 
이 식물은 두 달 동안 처음 높이의 3.3배로 자라났습니다. 
화분의 바닥부터 뿌리까지의 높이는 4.3cm입니다. 
현재 식물의 순수한 높이를 구하시오.        
*/

/*
[출력예시]
13.52
*/
public class A0407문제09 {
	public static void main(String[] args) {
		double a = 5.4;
		double b = 3.3;
		double c = 4.3;
		double d = a * b - c;

	    System.out.println(String.format("%.2f", d));
	}
}
