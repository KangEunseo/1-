class Car{
	String name;
	int Displacement;

	public void Klaxon(){
		System.out.println("���~");
	}
}

class Truck extends Car{
	int loadage;

	public void Klaxon(){
		System.out.println("����!");
	}

	public void load(){
		System.out.println("���� �ƴ�");
	}
}

class Sportscar extends Car{
	public void Klaxon(){
		System.out.println("�ѿ;Ӗؾ�!!");
	}
}

class Extend_Car4{
	public static void main(String ar[]){
		Car c=new Car();
		Truck t=new Truck();
		Sportscar s=new Sportscar();

		c.Klaxon();
		t.Klaxon();
		s.Klaxon();
	}
}