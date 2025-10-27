package A1402반복문과개수_개념연습;
/*
[문제]
반복문을 사용하여 18의 약수를 찾고,
그 중 짝수인 약수의 개수를 출력하시오.
*/
/*
[출력예시]
2 6 18 
3
*/
public class A1402개념연습02 {
	public static void main(String[] args) {
		int count = 0;
	    int num = 18;
	    for(int i = 1; i < 19; i++){
	        if(num % i == 0 && i % 2 == 0){
	        	System.out.print(i + " ");
	            count += 1;
	        }
	    }
	    System.out.println();
	    System.out.println(count);
	}
}
