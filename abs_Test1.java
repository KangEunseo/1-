abstract class Animal{
	String name;
	public void go(){
		System.out.println("����");
	}
	abstract public String eat();
	abstract public void sleep();
}

class cat extends Animal{	// �ڽ��� �ǹ� : �θ��� �߻�޼����� ���� �����
	public String eat(){
		return("�Դ�");
	}
	public void sleep(){
		System.out.println("�ڴ�");
	}
}

class abs_Test1{
	public static void main(String ar[]){
		cat c=new cat();
		System.out.println(c.eat());
		c.sleep();
	}
}