package A0202나누기와몫;
/*
	[소수점의한계]	
		예상한결과와는 다르게 소수점이 이상하게 계산되는것을 알수있다. 
		프로그래밍은 소수점 계산을 정확하게 계산할수없다.
		또한 소수점 이하 자릿수가 일정 이상 반복되면 그 값을 근사치로 처리한다.
		# [실수] 단원에서 소수점의 자리수를 제한하는방법을 배운다. 
*/
public class A0202개념02_소수점의한계 {
	public static void main(String[] args) {
	
		System.out.println(10.0 / 3);
		System.out.println(10 / 3.0);
		System.out.println(10.0 / 3.0);
	}
}
