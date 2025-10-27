package A1409규칙찾기_개념연습;
/*
[문제]
반복문을 사용해서 보기와 같이 출력하시오.

[보기]
0 0
1 2
2 6
3 12
4 20
5 30
6 42
7 56
8 72
9 90 
*/
public class A1409개념연습07 {
	public static void main(String[] args) {
		 int a = 0;
		    int count = 2;
		    for(int i = 0; i < 10; i++){
		    	System.out.println(i + " " + a);
		        a += count;
		        count += 2;
		    }

	}
}
