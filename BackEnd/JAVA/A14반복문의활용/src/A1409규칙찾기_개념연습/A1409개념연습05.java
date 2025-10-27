package A1409규칙찾기_개념연습;
/*
[문제]
반복문을 사용해서 보기와 같이 출력하시오.

[보기]
0 1
1 2
2 3
3 1
4 2
5 3
6 1
7 2
8 3
9 1 
*/
public class A1409개념연습05 {
	public static void main(String[] args) {
		int a = 1;
	    for(int i = 0; i < 10; i++){
	    	System.out.println(i + " " + a);
	        a += 1;
	        if(a == 4){
	            a = 1;
	        }
	    }
	}
}
