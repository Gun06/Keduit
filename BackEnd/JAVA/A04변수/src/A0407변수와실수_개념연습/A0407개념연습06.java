package A0407변수와실수_개념연습;
/*
[문제]
철수는 학교에 갈 때는 집에서 학교로 바로 가고, 집에 올 때는 학교에서 학원에 들렀다가 집으로 돌아옵니다. 
집에서 학교까지의 거리는 1278.50m, 학교에서 학원까지의 거리는 532.70m, 학원에서 집까지의 거리는 1110.45m입니다.
집에서 학교에 들러서 학원까지의 거리와 학원에서 집까지의 거리의 차이를 구하시오.        
*/

/*
[출력예시]
700.75
*/
public class A0407개념연습06 {
	public static void main(String[] args) {
		double a = 1278.50;
		double b = 532.70;
		double c = 1110.45;
		double d = a + b + c;

	    System.out.println(String.format("%.2f", d));
	}
}
