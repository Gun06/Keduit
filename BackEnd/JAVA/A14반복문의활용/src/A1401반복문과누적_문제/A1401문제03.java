package A1401반복문과누적_문제;
/*
[문제]
반복문을 사용하여 2000의 약수를 구한 뒤,
그 중 백의 자리가 4인 약수만을 누적하여 합을 출력하시오.
*/
/*
[출력예시]
400 
400
*/
public class A1401문제03 {
	public static void main(String[] args) {
		int total = 0;
	    for(int i = 1; i < 2001; i++){
	        boolean check1 = 2000 % i == 0;
	        if(check1){
	            int a = i % 1000 / 100;
	            if(a == 4){
	                total += i;
	                System.out.print(i + " ");
	            }
	        }
	    }
	    System.out.println();
	    System.out.println(total);
	}
}