class Person_Test{
	public static void main(String ar[]){
		Person p=new Person(); //객체생성(객체이름:p)
		p.name="Tom";
		p.age=27; //멤버변수접근:객체이름.멤버변수
		System.out.println("이름은 "+p.name+", 나이는 "+p.age);
		p.eat(); //메서드 호출==객체이름.메서드()
		p.go();

		Person p2=new Person();
		p2.name="Allen";
		p2.age=37;
		System.out.println("이름은 "+p2.name+", 나이는 "+p2.age);
		p2.eat();
		p2.go();
	}
}