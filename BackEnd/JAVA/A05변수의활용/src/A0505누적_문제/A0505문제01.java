package A0505누적_문제;
/*
[문제]
철수와 영희는 100개의 계단이 있는 곳에서 가위바위보 게임을 하고 있습니다. 
이기면 계단을 3칸 올라가고, 비기면 1칸 올라가며, 지면 2칸 내려가는 규칙입니다.
철수는 4번 이기고, 3번 비기고, 2번 졌습니다. 
이긴 순서, 비긴 순서, 진 순서에 따라 철수의 누적 위치를 출력하시오. 
게임은 50번째 계단에서 시작합니다.
*/

/*
[출력예시]
50
62
65
61        
*/
public class A0505문제01 {
	public static void main(String[] args) {
		int a = 50;
	    System.out.println(a);

	    int b = 3 * 4;
	    int c = 1 * 3;
	    int d = 2 * 2;

	    a = a + b;
	    System.out.println(a);

	    a = a + c;
	    System.out.println(a);

	    a = a - d;
	    System.out.println(a);
	}
}
