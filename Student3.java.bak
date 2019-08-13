class Student3{
	private String name;
	private int grade;
	private int tel;

	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return name;
	}

	public void setGrade(String grade){
		this.grade=Integer.parseInt(grade);
	}

	public int getGrade(){
		return grade;
	}

	public Student3(String name, int grade, int tel){
		this.name=name;
		this.grade=grade;
		this.tel=tel;
	}
	public Student3(String name, int tel){
		this.name=name;
		this.tel=tel;
	}
	public Student3(int grade, int tel){
		this.grade=grade;
		this.tel=tel;
	}

	public void study(){
		System.out.println("공부하다.");
	}
	public void play(){
		System.out.println("놀다.");
	}

	public void pr(String n, int g, int t){
		this.name=n;
		this.grade=g;
		this.tel=t;
		System.out.println("이름 : "+this.name+", 학년 : "+this.grade+", 전화번호 : "+this.tel);
	}

	public String pr(){
		return("이름 : "+this.name+", 학년 : "+Integer.toString(this.grade)+", 전화번호 : "+Integer.toString(this.tel));
	}

	public static void main(String ar[]){
		Student3 s1=new Student3("Mike",1,111);
		Student3 s2=new Student3("Alice",2,222);
		Student3 s3=new Student3(3,333);
		Student3 s4=new Student3("Tom",555);

		System.out.println("s4의 이름 : "+s4.name);
		System.out.println("s4의 학년 : "+s4.grade);
		System.out.println("s4의 전화번호 : "+s4.tel);

		s2.pr("Kuanlin", 2, 3);
        System.out.println(s2.pr());

		s1.study();
		s1.play();

		s3.setName("Jihoon");
		s4.setGrade("2");

		System.out.println("s3의 이름 : "+s3.getName());
		System.out.println("s4의 학년 : "+s4.getGrade());
	}
}