class Car_Test{
	public static void main(String ar[]){
		Car c=new Car();
		c.name="벤츠";
		c.num=2033;
		c.owner="강은서";
		c.color="black";
		System.out.println("차 정보 >> "+c.name+", "+c.num+", "+c.owner+", "+c.color);
		c.go("Kuanlin","Jihoon");
		c.stop(5);
		c.drive();
	}
}