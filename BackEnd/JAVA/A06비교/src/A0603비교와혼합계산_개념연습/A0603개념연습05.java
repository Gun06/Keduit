package A0603비교와혼합계산_개념연습;
/*
[문제]
가로 3cm, 세로 7cm인 파란색 색종이 11장과
가로 4cm, 세로 5cm인 노란색 색종이 13장이 있습니다.
파란색 색종이의 총 넓이와 노란색 색종이의 총 넓이가 같은지 확인하고, true 또는 false로 출력하시오.      
*/

/*
[출력예시]
false
*/
public class A0603개념연습05 {
	public static void main(String[] args) {
		int a = 3 * 7 * 11;
		int b = 4 * 5 * 13;
		boolean c = a == b;
		System.out.println(c);
	}
}
