class obj_Test1 {
	public static void main(String ar[]) {
		Person p=new Person(); //객체 만드는 방법
		p.name="Edward Lai";
		p.age=18;
		p.go();
		p.eat();

		System.out.println("이름은 "+p.name);
		System.out.println("나이는 "+p.age);
	}
}