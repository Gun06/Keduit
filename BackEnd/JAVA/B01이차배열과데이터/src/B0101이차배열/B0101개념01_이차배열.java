package B0101이차배열;

public class B0101개념01_이차배열 {
	public static void main(String[] args) {
		
		int[][] darr = new int[2][3];
		darr[0][0] = 1;
		darr[0][1] = 2;
		darr[0][2] = 3;
		darr[1][0] = 4;
		darr[1][1] = 5;
		darr[1][2] = 6;
		
		
	    System.out.print(darr[0][0] + " ");
	    System.out.print(darr[0][1]+ " ");
	    System.out.println(darr[0][2]);
	    
	    System.out.print(darr[1][0] + " ");
	    System.out.print(darr[1][1] + " ");
	    System.out.println(darr[1][2]);
	    
	}
}