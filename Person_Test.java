class Person_Test{
	public static void main(String ar[]){
		Person p=new Person(); //��ü����(��ü�̸�:p)
		p.name="Tom";
		p.age=27; //�����������:��ü�̸�.�������
		System.out.println("�̸��� "+p.name+", ���̴� "+p.age);
		p.eat(); //�޼��� ȣ��==��ü�̸�.�޼���()
		p.go();

		Person p2=new Person();
		p2.name="Allen";
		p2.age=37;
		System.out.println("�̸��� "+p2.name+", ���̴� "+p2.age);
		p2.eat();
		p2.go();
	}
}