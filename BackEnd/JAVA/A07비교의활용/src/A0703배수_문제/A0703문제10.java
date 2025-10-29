package A0703배수_문제;
/*
[문제]
가로가 3이고 세로가 6인 사각형 넓이가 홀수인지 확인하고, true 또는 false로 출력하시오.
*/

/*
[출력예시]
false
*/

public class A0703문제10 {
	public static void main(String[] args) {
		int width = 3;
	    int height = 6;
	    int recArea  = width * height;

	    boolean result = recArea % 2 != 0;
	    System.out.println(result);
	}
}
