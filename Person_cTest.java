class Person_cTest{
	String name;
	int age;

	public void eat(){
		System.out.println("�Դ�");
	}

	public Person_cTest(String s){
		this.name=s;
	}

	public Person_cTest(int i){
		this.age=i;
	}

	public Person_cTest(String s, int i){
		this.name=s;
		this.age=i;
	}
	
	public static void main(String ar[]){
		Person_cTest p1=new Person_cTest("Kuanlin");
		Person_cTest p2=new Person_cTest("Jihoon", 20);
		Person_cTest p3=new Person_cTest(18);
		System.out.println("p1�� �̸��� "+p1.name+"�Դϴ�.");
		System.out.println("p2�� �̸��� "+p2.name+"�̰� "+p2.age+"���Դϴ�.");
		System.out.println("p3�� ���̴� "+p3.age+"���Դϴ�.");
	}
}