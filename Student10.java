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
		return super.toString()+", ���� : "+this.major;
	}

	public static void main(String ar[]){
		Student10 s1=new Student10("����", 21, "��ǻ��");
		Student10 s2=new Student10("����", 22, "�濵");
		Student10 s3=new Student10("����", 24, "����");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
	}
}