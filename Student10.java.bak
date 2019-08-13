class Student10 extends Human{
	String major;

	public Student10(){ }

	public Student10(String name, int age, String major){
		super(name, age);
		this.major=major;
	}

	public Student10(String name, int age, String ancestor, String fur, String bloodtype, String birthday, String major){
		super(name, age, ancestor, fur, bloodtype, birthday);
		this.major=major;
	}

	public String toString(){
		return super.toString()+", 전공 : "+this.major;
	}

	public static void main(String ar[]){
		Student10 s1=new Student10("명진", 21, "컴퓨터");
		Student10 s2=new Student10("미현", 22, "경영");
		Student10 s3=new Student10("용준", 24, "경제");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
	}
}