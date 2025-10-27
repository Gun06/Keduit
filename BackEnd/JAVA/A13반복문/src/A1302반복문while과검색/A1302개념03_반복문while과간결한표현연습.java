package A1302반복문while과검색;

/*
	[반복문 while과 간결한 표현 연습]
	반복문을 사용하여 1부터 9까지 출력하되,
	1부터 5까지는 숫자 뒤에 "o"를 출력하고,
	6부터 9까지는 숫자 뒤에 "x"를 출력합니다.
	숫자와 문자 사이에는 공백 한 칸을 추가하여 출력하시오.
	단, if문을 사용할 때 else는 사용하지 않습니다.
 */

/*
	[출력예시]
	1 o
	2 o
	3 o
	4 o
	5 o
	6 x
	7 x
	8 x
	9 x
 */

public class A1302개념03_반복문while과간결한표현연습 {
	public static void main(String[] args) {
		
		int i = 1;
		while(i <= 9) {
			boolean check = 1 <= i && i <= 5;
			if(check) {
				System.out.println(i + " o");
			}
			if(!check) {
				System.out.println(i + " x");
			}
			i += 1;
		}
	}
}
