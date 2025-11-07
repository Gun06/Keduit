package A1406순서_문제;
/*
[문제]
120의 약수를 작은 수부터 큰 수까지 순서대로 찾고, 
일의 자리가 4인 두 번째 약수를 출력하시오.
*/
/*
[출력예시]
1 2 3 4 5 6 8 10 12 15 20 24 30 40 60 120 
24
*/
public class A1406문제01 {
	public static void main(String[] args) {
int num = 120;
		    int count = 0;
		    int find = 0;
		    for(int i = 1; i < 121; i++){
		        if(num % i == 0){
		        	System.out.print(i + " ");
		            int a = i % 10;
		            if(a == 4){
		                count += 1;
		                if(count == 2){
		                    find = i;
		                }
		            }
		        }
		    }
		    System.out.println();
		    System.out.println(find);
	}
}
