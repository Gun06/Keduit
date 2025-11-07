package A1409규칙찾기_문제;
/*
[문제]
반복문을 사용해서 보기와 같이 출력하시오.

[보기]
0 0 1
1 2 3
2 4 5
3 6 7
4 8 9 
*/
public class A1409문제01 {
	public static void main(String[] args) {
for(int i = 0; i < 5; i++){
			 	int a = i;
			 	int b = i * 2;
			 	int c = i * 2 + 1;
			 	System.out.println(a + " " + b + " " + c);
		    }
	}
}
