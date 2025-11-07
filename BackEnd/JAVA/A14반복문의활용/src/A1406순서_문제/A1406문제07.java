package A1406순서_문제;
/*
[문제]
100의 약수를 큰 수부터 작은 수까지 거꾸로 찾은 후, 
두 번째 약수에서 다섯 번째 약수를 뺀 값을 출력하시오.
*/
/*
[출력예시]
100 50 25 20 10 5 4 2 1 
40
*/
public class A1406문제07 {
	public static void main(String[] args) {
int num = 100;
		    int count = 0;
		    int a = 0;
		    int b = 0;
		    int i2 = num;
		    for(int i = 1; i < num + 1; i++){
		        if(num % i2 == 0){
		        	System.out.print(i2 + " ");
		            count += 1;
		            if(count == 2){
		                a = i2;
		            }
		            if(count == 5){
		                b = i2;
		            }
		        }
		        i2 -= 1;
		    }
		    System.out.println();
		    System.out.println(a - b);
	}
}
