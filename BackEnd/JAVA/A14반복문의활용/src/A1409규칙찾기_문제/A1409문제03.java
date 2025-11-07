package A1409규칙찾기_문제;
/*
[문제]
반복문을 사용해서 보기와 같이 출력하시오.

[보기]
0 30
1 29
2 27
3 24
4 20
5 15
6 9
7 2
8 -6
9 -15
*/
public class A1409문제03 {
	public static void main(String[] args) {
int total = 30;
		    for(int i = 0; i < 10; i++){
		        total -= i;
		        System.out.println(i + " " + total);
		    }
	}
}
