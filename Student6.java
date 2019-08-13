class Student6{
	String name;
	static int count=0;

	public Student6(){
		count ++;          // 객체 생성한 만큼 증가
	}

	public static void main(String ar[]){
		Student6 s1=new Student6();
		Student6 s2=new Student6();
		Student6 s3=new Student6();

		System.out.println("만든 객체 수 : "+Student6.count);
	}
}