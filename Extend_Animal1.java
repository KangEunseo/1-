class Extend_Animal1{
	public static void main(String ar[]){
		dog d=new dog("�ƽ�", "����");
		System.out.println("�̸� : "+d.name);
		System.out.println("���� : "+d.owner);
		d.eat();
		d.bark();

		System.out.println();

		cat c=new cat("�̹�", "����");
		System.out.println("�̸� : "+c.name);
		System.out.println("���� : "+c.owner);
		c.eat();
		c.scratch();

		System.out.println();

		sheep s=new sheep("���", "�簻");
		System.out.println("�̸� : "+s.name);
		System.out.println("���� : "+s.owner);
		s.eat();
		s.cry();
	}
}