package A1408개별개수_문제;
/*
[문제]
200부터 250까지의 숫자중에서 
5의 배수를 출력한다.
5의배수를 각각의 자리로 숫자를 나눈 후, 
2또는 5의 개수가 2개인 숫자만 출력하시오. 
*/
/*
[출력예시]
205 2
215 2
220 2
235 2
245 2
250 2
*/
public class A1408문제01 {
	public static void main(String[] args) {
int count = 0;
		    for(int i = 200; i < 251; i++){
		        if(i % 5 == 0){
		            int a = i / 100;
		            int b = i % 100 / 10;
		            int c = i % 10;
		            
		            if(a == 2 || a == 5){
		                count += 1;
		            }
		            if(b == 2 || b == 5){
		                count += 1;
		            }
		            if(c == 2 || c == 5){
		                count += 1;
		            }
		            if(count == 2){
		            	System.out.println(i + " " + count);
		            }
		            count = 0; // 0으로 해주지않으면 계속 누적된다. 
		        }
		    }
	}
}
