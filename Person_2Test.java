class Person_2 {
	String name;
	int age;

	public void go() {
		System.out.println("가다");
	}

	public void eat() {
		System.out.println("먹다");
	}
}
class Person_2Test{
	//하나의 파일에 여러개의 클래스파일이 있을시 파일이름은 main이 있는 클래스이름으로 지정함
	public static void main(String ar[]){
		Person_2 p=new Person_2(); //객체생성(객체이름:p)
		p.name="Tom";
		p.age=27; //멤버변수접근:객체이름.멤버변수
		System.out.println("이름은 "+p.name+", 나이는 "+p.age);
		p.eat(); //메서드 호출==객체이름.메서드()
		p.go();

		Person_2 p2=new Person_2();
		p2.name="Allen";
		p2.age=37;
		System.out.println("이름은 "+p2.name+", 나이는 "+p2.age);
		p2.eat();
		p2.go();
	}
}