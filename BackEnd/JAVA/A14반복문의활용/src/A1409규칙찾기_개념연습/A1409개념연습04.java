package A1409규칙찾기_개념연습;
/*
[문제]
반복문을 사용해서 보기와 같이 출력하시오.

[보기]
0 0
1 0
2 1
3 1
4 2
5 2
6 3
7 3
8 4
9 4 
*/
public class A1409개념연습04 {
	public static void main(String[] args) {
		int a = -1;
	    for(int i = 0; i < 10; i++){
	        if(i % 2 == 0){
	            a += 1;
	        }
	        System.out.println(i + " " + a);
	      
	    }
	}
}
