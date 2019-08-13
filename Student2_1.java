class Student2_1{
	public static void main(String ar[]){
		Student2 s2=new Student2();
		s2.name="강은서";	
		s2.grade=1;
		String str=s2.pr();
		System.out.println("제 이름은 "+str+"입니다.");
		s2.study("Java");
	}
}