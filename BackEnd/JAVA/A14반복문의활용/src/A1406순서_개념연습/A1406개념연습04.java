package A1406순서_개념연습;
/*
[문제]
100의 약수를 전부 출력한다. 
그리고 첫 번째 약수와 두 번째 약수의 합을 출력하시오.
*/
/*
[출력예시]
1 2 4 5 10 20 25 50 100
3
*/
public class A1406개념연습04 {
	public static void main(String[] args) {
		int num = 100;
	    int total= 0;
	    int count = 0;
	    for(int i = 1; i < 101; i++){
	        if(num % i == 0){
	        	System.out.print(i + " ");
	            count += 1;
	            if(count == 1){
	                total += i;
	            }
	            if(count == 2){
	                total += i;
	            }
	        }
	    }
	    System.out.println();
	    System.out.println(total);
	}
}
