class Dog1{
	private String name;
	public String breed;
	private int age;

	Dog1(String name, int age){
		this.name=name;
		this.age=age;
	}

	Dog1(String name, String breed, int age){
		this.name=name;
		this.breed=breed;
		this.age=age;
	}

	public String toString(){
		return ("�̸� : "+name+", �� : "+breed+", ���� : "+age);
	}

	public static void main(String ar[]){
		Dog1 d=new Dog1("�ƽ�", "��������", 1);
		System.out.println(d.toString());
	}
}