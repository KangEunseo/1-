class Car_Test{
	public static void main(String ar[]){
		Car c=new Car();
		c.name="����";
		c.num=2033;
		c.owner="������";
		c.color="black";
		System.out.println("�� ���� >> "+c.name+", "+c.num+", "+c.owner+", "+c.color);
		c.go("Kuanlin","Jihoon");
		c.stop(5);
		c.drive();
	}
}