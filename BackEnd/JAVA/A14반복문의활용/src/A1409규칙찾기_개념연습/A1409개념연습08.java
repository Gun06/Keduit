package A1409규칙찾기_개념연습;
/*
[문제]
반복문을 사용해서 보기와 같이 출력하시오.

[보기]
0 3
1 2
2 1
3 3
4 2
5 1
6 3
7 2
8 1
9 3 
*/
public class A1409개념연습08 {
	public static void main(String[] args) {
		 int a = 3;
		    for(int i = 0; i < 10; i++){
		    	System.out.println(i + " " + a);
		        a -= 1;
		        if(a == 0){
		            a = 3;
		        }
		    }
	}
}
