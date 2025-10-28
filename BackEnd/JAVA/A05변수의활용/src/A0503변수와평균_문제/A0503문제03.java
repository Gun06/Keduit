package A0503변수와평균_문제;
/*
[문제]
철수는 색종이를 20장, 영희는 색종이를 14장, 민수는 색종이를 6장 가지고 있습니다. 
세 학생의 색종이를 전부 모아서 세 사람이 똑같이 나눠 가지면,  각자 몇 장씩 나눠 가질 수 있는지 구하시오.           
*/

/*
[출력예시]
13
*/

public class A0503문제03 {
	public static void main(String[] args) {
		int a = 20;
	    int b = 14;
	    int c = 6;
	    int d = a + b + c;
	    int e = d / 3;

	   System.out.println(e);
	}
}
