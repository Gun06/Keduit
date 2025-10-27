package B0601캡슐화_암기;
/*
 * [암기하시오]
 */
class Student1 {
	 String name;
	 int age;
	
	 Student1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	 String getName() {
		return name;
	}

	 void setName(String name) {
		this.name = name;
	}

	 int getAge() {
		return age;
	}

	 void setAge(int age) {
		this.age = age;
	}

}

class Student2{
	public String name;
	public int age;
}


public class B0601개념연습01 {
	public static void main(String[] args) {
		
		
		Student1 hgd = new Student1("홍길동", 11);

		System.out.println(hgd.getName());
		System.out.println(hgd.getAge());
		
		hgd.setName("이만수");
		hgd.setAge(20);
				
		System.out.println(hgd.getName());
		System.out.println(hgd.getAge());
		
	
	}
}
