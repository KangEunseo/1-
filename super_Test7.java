class Greeting2{
	public String name="Mike";
	public void sayHello(){
		System.out.println("¾È³ç");
	}
}

class EngHello2 extends Greeting2{
	public  String name="Moon";
	public void sayHello(){
		System.out.println("Hi");
	}
	public void test(){
		System.out.println(super.name);
		super.sayHello();
	}
}

class super_Test7{
	public static void main(String ar[]){
		EngHello2 e=new EngHello2();
		e.test();
		e.sayHello();
	}
}