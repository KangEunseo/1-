class Person_cTest{
	String name;
	int age;

	public void eat(){
		System.out.println("먹다");
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
		System.out.println("p1의 이름은 "+p1.name+"입니다.");
		System.out.println("p2의 이름은 "+p2.name+"이고 "+p2.age+"살입니다.");
		System.out.println("p3의 나이는 "+p3.age+"살입니다.");
	}
}