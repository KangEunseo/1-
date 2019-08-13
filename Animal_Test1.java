class Animal_Test1{
	public static void main(String ar[]){

		Animal a1=new Animal();
		a1.leg=4;
		a1.owner="Mike";
		a1.eat();

		System.out.println("동물 a1의 다리는 "+a1.leg+"개, 주인의 이름은 "+a1.owner+"입니다.");

		Animal a2=new Animal();
		a2.leg=2;
		a2.owner="Alice";
		a2.eat();
		
		System.out.println("동물 a2의 다리는 "+a2.leg+"개, 주인의 이름은 "+a2.owner+"입니다.");
	}
}