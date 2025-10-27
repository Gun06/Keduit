package A0506교환_개념연습;
/*
[문제]
철수는 시험 과목인 국어, 수학, 영어 점수를 각각 변수 a, b, c에 저장했습니다. 
시험 점수는 각각 45점, 65점, 75점입니다.
가장 작은 점수와 가장 큰 점수를 교환한 후의 점수를 출력하시오.     
*/

/*
[출력예시]
75
65
45        
*/

public class A0506개념연습01 {
	public static void main(String[] args) {
		 int a = 45;
	    int b = 65;
	    int c = 75;

	    int d = a;
	    int e = c;

	    a = e;
	    c = d;
	    System.out.println(a);
	    System.out.println(b);
	    System.out.println(c);
	}
}
