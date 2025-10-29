package A0903논리와서술형_문제;

/*
    [문제]
    귤 6개의 무게는 840g이고, 사과 3개의 무게는 750g입니다.
    귤 5개의 무게가 사과 2개의 무게보다 무겁고,
    귤 7개의 무게가 사과 4개의 무게보다 무거운지 확인하고, true 또는 false로 출력하시오.    
*/

/*
    [출력예시]
    false    
*/

public class A0903문제05 {
	public static void main(String[] args) {
		int a = 840 / 6;
	    int b = a * 5;
	    int c = a * 7;

	    int d = 750 / 3;
	    int e = d * 2;
	    int f = d * 4;

	    boolean g = b > e && c > f;
	    System.out.println(g);
	}
}
