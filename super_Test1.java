class Car4{
	Car4(){}
	Car4(String name){
		System.out.println(name+" Car 持失切");
	}
}

class Truck extends Car4{
	Truck(){
		//super(); 持繰
		System.out.println("Truck 持失切");
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