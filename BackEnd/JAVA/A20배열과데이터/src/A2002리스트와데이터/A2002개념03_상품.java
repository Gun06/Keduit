package A2002리스트와데이터;
/*
[문제]
item 리스트는 상품의 번호이다.
price 리스트는 상품의 가격이다.
count 리스트는 상품의 재고 개수이다.

각각의 상품별 번호와 매출을 출력하시오.
*/
/*
[출력예시]
1001 1500
1002 1200
1003 8600
1004 2300
*/
public class A2002개념03_상품 {
	public static void main(String[] args) {
		int[] item 	= {1001, 1002, 1003, 1004};
	    int[] price = { 500, 1200, 4300, 2300};
	    int[] count = {   3,    1,    2,    1};

	    for(int i = 0; i < item.length; i++){
	        int total = price[i] * count[i];
	        System.out.println(item[i] + " " + total);
	    }
	}
}
