class Student6{
	String name;
	static int count=0;

	public Student6(){
		count ++;          // ��ü ������ ��ŭ ����
	}

	public static void main(String ar[]){
		Student6 s1=new Student6();
		Student6 s2=new Student6();
		Student6 s3=new Student6();

		System.out.println("���� ��ü �� : "+Student6.count);
	}
}