package A1805indexOf함수;

public class A1805개념03_함수indexOf3 {
	public static void main(String[] args) {
		
		// 여러글자도 찾아준다. 
		// 찾은글자의 첫번째 인덱스를 반환한다. 
        
        String text = "Hello, JavaScript!";
        String word = "llo";
        int index = text.indexOf(word);
       

        
        if(index == -1) {
        	System.out.println("해당 문자는 존재하지 않습니다.");
        }else {
        	System.out.println(index);
        }
	}
}
