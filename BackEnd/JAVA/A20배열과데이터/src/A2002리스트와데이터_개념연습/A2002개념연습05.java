package A2002리스트와데이터_개념연습;
/*
[문제]
item 리스트는 상품의 번호이다.
price 리스트는 상품의 가격이다.
count 리스트는 상품의 재고 개수이다.

가장 매출이 높은 상품의 번호와 가격을 출력하시오.
단, 매출이 같은 경우 모두 출력하시오.
*/
/*
[출력예시]
8000
1003 8000
1005 8000
*/
public class A2002개념연습05 {
	public static void main(String[] args) {
		int[] item = {1001, 1002, 1003, 1004, 1005};
	    int[] price = {500, 1200, 4000, 2300, 2000};
	    int[] count = {   3,    1,    2,    1,    4};

	    int max = price[0] * count[0];
	    for(int i = 1; i < item.length; i++){
	        int total = price[i] * count[i];
	        if(max < total){
	            max = total;
	        }
	    }

	    System.out.println(max);
	    for(int i = 0; i < item.length; i++){
	        int total = price[i] * count[i];
	        if(total == max){
	        	System.out.println(item[i] + " " + total);
	        }
	    }
	}
}
