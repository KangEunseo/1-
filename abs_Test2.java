abstract class Person30{
	String name;
	String hair_color;
	int height;

	public void go(){
		System.out.println("����");
	}

	abstract public String eat(String food);
	abstract public int buy(String product);
}

abstract class baby1 extends Person30{
	public String eat(String food){
		return food;
	}
}

class baby2 extends baby1{
	public int buy(String product){
		return 1000;
	}
}

class abs_Test2{
	public static void main(String ar[]){
		baby2 b=new baby2();
		b.name="����";
		b.hair_color="kahki";
		b.height=173;
		b.go();
		System.out.println(b.eat("ġŲ"));
		System.out.println(b.buy("ȣ��")+"��");
	}
}