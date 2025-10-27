package A0801논리_개념연습;
/*
	[문제]
	철수의 학교에서는 국어 점수가 100점이거나 수학 점수가 100점인 경우 장학생으로 선정됩니다. 
	철수는 이번 시험에서 국어 99점과 수학 99점을 받았습니다. 
	철수가 장학생인지 확인하고, true 또는 false로 출력하시오.    
*/

/*
	[출력예시]
	false    
*/
public class A0801개념연습02 {
	public static void main(String[] args) {
		 int a = 99;
	    int b = 99;
	    boolean c = a == 100 || b == 100;
	    System.out.println(c);
	}
}
