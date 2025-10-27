package A1805indexOf함수_개념연습;

public class A1805개념연습01 {

	public static void main(String[] args) {
		 /*
	        [문제]
	            arr배열은 단어들이 모여있는 배열이다.
	            find는 검색하고 싶은 단어의 일부분이다.
	            arr배열에서 find의 부분이 일치하는 단어들을 출력하시오.
	        [정답] 
	            school
				teacher
				child
	            
	        
	    */

	    String[] arr = {"school", "teacher", "child","father", "love"};
	    String find = "ch";
	
	    for(int i = 0; i < arr.length; i++){
	        String a = arr[i];
	        if(a.indexOf(find) == -1){
	            continue;
	        }
	        System.out.println(a);
	    }
    

	}

}
