package A0407변수와실수_문제;
/*
[문제]
철수가 높이 2.7cm인 장난감 블럭을 4개 이어 붙였습니다. 
이렇게 이어진 블럭을 두께가 1.2cm인 바닥판 위에 쌓았습니다. 
장난감 블럭의 총 높이를 구하시오.        
*/

/*
[출력예시]
12
*/
public class A0407문제08 {
	public static void main(String[] args) {
		double a = 2.7;
		double b = 4;
		double c = 1.2;
		double d = a * b + c;

	    System.out.println(String.format("%.2f", d));
	}
}
