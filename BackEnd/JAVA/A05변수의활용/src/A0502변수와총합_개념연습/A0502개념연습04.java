package A0502변수와총합_개념연습;
/*
[문제]
철수는 운동을 위해 집에서 직진으로 1800m를 걸었습니다.
그 후, 집으로 돌아가기 위해 300m를 되돌아갔습니다.
잠시 쉬었다가 집 쪽으로 200m를 더 걸었을 때, 쉬었던 자리에 가방을 두고 온 것을 깨달았습니다.
철수는 다시 쉬었던 자리로 되돌아가 가방을 챙긴 후, 집으로 돌아왔습니다.
철수가 오늘 걸은 총 거리를 구하시오.        
*/

/*
[출력예시]
4000
*/
public class A0502개념연습04 {
	public static void main(String[] args) {
	    int a = 1800;
	    int b = 300;
	    int c = 200;
	    int d = a - b;
	    int e = a + b + c + c + d;
	    System.out.println(e);
	}
}
