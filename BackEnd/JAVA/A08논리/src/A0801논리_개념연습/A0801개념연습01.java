package A0801논리_개념연습;
/*
	[문제]
	철수는 수학 시험에서 67점을 받았습니다. 
	시험 점수가 60점 이상 100점 이하인 경우 합격으로 간주됩니다. 
	철수는 수학시험에서 합격인지 확인하고, true 또는 false로 출력하시오.
*/

/*
	[출력예시]
	true
*/
public class A0801개념연습01 {
	public static void main(String[] args) {
		int a = 67;
	    boolean b = 60 <= a && a <= 100;
	    System.out.println(b);
	}
}
