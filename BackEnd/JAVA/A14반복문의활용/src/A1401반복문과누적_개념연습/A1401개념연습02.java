package A1401반복문과누적_개념연습;
/*
[문제]
반복문을 사용하여 18의 약수를 구한 뒤,
그 중 짝수의 약수만을 누적하여 합을 출력하시오.
*/
/*
[출력예시]
2 6 18 
26
*/
public class A1401개념연습02 {
	public static void main(String[] args) {
		int total = 0;
	    for(int i = 1; i < 19; i++){
	        boolean check = 18 % i == 0 && i % 2 == 0;   
	        if(check){
	        	System.out.print(i + " ");
	            total += i;
	        }
	    }
	    System.out.println();
	    System.out.println(total);
	}
}
