class Car4{
	Car4(){}
	Car4(String name){
		System.out.println(name+" Car ������");
	}
}

class Truck extends Car4{
	Truck(){
		//super(); ����
		System.out.println("Truck ������");
	}
	Truck(String name){
		super(name);
	}
}

class super_Test1{
	public static void main(String ar[]){
		Truck t=new Truck("Sonata");
	}
}