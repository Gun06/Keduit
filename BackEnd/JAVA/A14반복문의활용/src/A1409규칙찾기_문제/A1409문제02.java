package A1409규칙찾기_문제;
/*
[문제]
반복문을 사용해서 보기와 같이 출력하시오.

[보기]
0 0
1 1
2 3
3 6
4 10
5 15
6 21 
*/
public class A1409문제02 {
	public static void main(String[] args) {
int total = 0;
	    for(int i = 0; i < 7; i++){
	        total += i;
	        System.out.println(i + " " + total);
	       
	    }
	}
}
