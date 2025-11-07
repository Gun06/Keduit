package A1406순서_문제;
/*
[문제]
100의 약수를 작은 수부터 큰 수까지 순서대로 찾고, 
20보다 큰 수 중에서 첫 번째 약수와 두 번째 약수의 합을 출력하시오.
*/
/*
[출력예시]
1 2 4 5 10 20 25 50 100 
75
*/
public class A1406문제05 {
	public static void main(String[] args) {
int num1 = 100;
		    int num2 = 20;
		    int count = 0;
		    int total = 0;
		    for(int i = 1; i < 101; i++){
		        if(num1 % i == 0){
		        	System.out.print(i + " ");
		            if(i > num2){
		                count += 1;
		                if(count == 1){
		                    total += i;
		                }
		                if(count == 2){
		                    total += i;
		                }
		            }
		        }
		    }
		    System.out.println();
		    System.out.println(total);
	}
}
