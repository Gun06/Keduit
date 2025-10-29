package A0506교환_문제;
/*
[문제]
철수는 시험 과목인 국어, 수학, 영어, 사회 점수를 각각 변수 a, b, c, d에 저장했습니다. 
시험 점수는 각각 45점, 65점, 75점, 80점입니다.
철수는 국어, 수학, 영어, 사회 순서대로 점수를 공책에 작성했다고 생각했지만, 
실수로 한 칸씩 밀려서 수학, 영어, 사회, 국어 순서로 작성했습니다. 
교환을 사용하여 원래의 점수대로 변수 값을 수정하고 출력하시오.        
*/

/*
[출력예시]
80
45
65
75        
*/
public class A0506문제02 {
	public static void main(String[] args) {
		int a = 45;
		int b = 65;
	    int c = 75;
	    int d = 80;

	    int e = a;
	    int f = b;
	    int g = c;
	    int h = d;

	    a = h;
	    b = e;
	    c = f;
	    d = g;

	    System.out.println(a);
	    System.out.println(b);
	    System.out.println(c);
	    System.out.println(d);
	}
}
