class Animal_Test1{
	public static void main(String ar[]){

		Animal a1=new Animal();
		a1.leg=4;
		a1.owner="Mike";
		a1.eat();

		System.out.println("���� a1�� �ٸ��� "+a1.leg+"��, ������ �̸��� "+a1.owner+"�Դϴ�.");

		Animal a2=new Animal();
		a2.leg=2;
		a2.owner="Alice";
		a2.eat();
		
		System.out.println("���� a2�� �ٸ��� "+a2.leg+"��, ������ �̸��� "+a2.owner+"�Դϴ�.");
	}
}