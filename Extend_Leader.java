class Student7{
	String name;
	int Student_ID;
	String tel;
	String address;
	String department;
	public void study(){
		System.out.println("�����ϴ�");
	}
	public void eat(){
		System.out.println("�Դ�");
	}
	public void test(){
		System.out.println("���躸��");
	}
	public void act(){
		System.out.println("Ȱ���ϴ�");
	}
}

class Leader extends Student7 {
    boolean PoN;
	public Leader(String name, int Student_ID, String tel,	String address, String department, boolean PoN){
		this.name=name;
		this.Student_ID=Student_ID;
		this.tel=tel;
		this.address=address;
		this.department=department;
		this.PoN=PoN;
	}
    public void hello(){
		System.out.println("�λ��ϴ�");
	}
}

class Extend_Leader{
	public static void main(String ar[]){
		Leader l=new Leader("������", 1401, "010-1111-2222", "����� ��õ�� ������", "���ַ�ǰ�", false);
		System.out.println("�̸� : "+l.name);
		System.out.println("�й� : "+l.Student_ID);
		System.out.println("��ȭ��ȣ : "+l.tel);
		System.out.println("�ּ� : "+l.address);
		System.out.println("�а� : "+l.department);
		System.out.println("ȸ�忩�� : "+l.PoN);
		l.study();
		l.eat();
		l.test();
		l.act();
		l.hello();
	}
}