package A1409규칙찾기_개념연습;
/*
[문제]
반복문을 사용해서 보기와 같이 출력하시오.

[보기]
0 30
1 28
2 24
3 18
4 10
5 0
6 -12
7 -26
8 -42
9 -60  
*/
public class A1409개념연습06 {
	public static void main(String[] args) {
	    int a = 30;
	    int count = 2;
	    for(int i = 0; i < 10; i++){
	        System.out.println(i + " " + a);
	        a -= count;
	        count += 2;
	    }
	}
}
