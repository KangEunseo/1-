class extend_Test1{
	public static void main(String ar[]){
		Player p=new Player();
		p.name="jihoon";      System.out.println("p�� �̸� : "+p.name);
		p.age=20;      System.out.println("p�� ���� : "+p.age);
		p.height=173;      System.out.println("p�� Ű : "+p.height);
		p.eat();
		p.go();
		p.play();

		System.out.println();

		Singer s=new Singer();
        s.name="kuanlin";      System.out.println("s�� �̸� : "+s.name);
		s.age=18;      System.out.println("s�� ���� : "+s.age);
		s.height=185;      System.out.println("s�� Ű : "+s.height);
		s.eat();
		s.go();
		s.sing();
	}
}