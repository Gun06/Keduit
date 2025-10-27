package A1408개별개수_개념연습;
/*
[문제]
반복문을 사용하여 10부터 20까지의 숫자 중, 
각 숫자의 십의 자리와 일의 자리를 나누어 4와 8이 포함되는지 확인하고,
4와 8이 나타난 총 개수를 출력하시오.
*/
/*
[출력예시]
40 1
41 1
42 1
43 1
44 2
45 1
46 1
47 1
48 2
49 1
50 0
12
*/
public class A1408개념연습03 {
	public static void main(String[] args) {
		 int totalCount = 0;
		    for(int i = 40; i < 51; i++){
		        int count = 0;
		        int a = i / 10;
		        int b = i % 10;
		        if(a == 4 || a == 8){
		            count += 1;
		        }
		        if(b == 4 || b == 8){
		            count += 1;
		        }
		        System.out.println(i + " " + count);
		        totalCount += count;
		    }
		    System.out.println(totalCount);
	}
}
