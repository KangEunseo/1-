class Student4{
	private String name;
	private int grade;
	private int class1;
	private int telephone;

	public String eat(String s){
		return(s+"(을)를 먹다");
 	}

	public Student4(String name, int grade, int class1, int telephone){
		this.name=name;
		this.grade=grade;
		this.class1=class1;
		this.telephone=telephone;
	}

	public Student4(String name, int telephone){
		this.name=name;
		this.telephone=telephone;
	}

	public Student4(int grade, int class1, int telephone){
		this.grade=grade;
		this.class1=class1;
		this.telephone=telephone;
	}

	public Student4(){}

	public static void main(String ar[]){
		Student4 s1=new Student4("Mike", 1, 4, 111);
		Student4 s2=new Student4("Alice", 2, 5, 222);
		Student4 s3=new Student4("Tom", 333);
		Student4 s4=new Student4(3, 6, 555);
        Student4 s5=new Student4("John", 666);
		Student4 s6=new Student4("장민재", 777);
		Student4 s7=new Student4();

		System.out.println("이름 : "+s3.name+", 학년 : "+s3.grade+", 반 : "+s3.class1+", 전화번호 : "+s3.telephone);

		System.out.println(s5.eat("라면"));
	}
}