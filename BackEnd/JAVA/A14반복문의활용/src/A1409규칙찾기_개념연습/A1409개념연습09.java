package A1409규칙찾기_개념연습;
/*
[문제] 
1~9 사이의 숫자를 출력하시오.
단, 한줄에 3개의 숫자만 출력하시오.
그뒤론 줄바꿈을 해준다.
[출력예시]
1 2 3 
4 5 6 
7 8 9
*/
public class A1409개념연습09 {
	public static void main(String[] args) {
		 int count = 0;
		    for(int i = 1; i < 10; i++){
		    	System.out.print(i + " ");
		        count += 1;
		        if(count == 3){
		        	System.out.println();
		            count = 0;
		        }
		    }
	}
}
