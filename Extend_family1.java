class GrandFather{
	public GrandFather(){
		System.out.println("���� �Ҿƹ���");
	}

	public GrandFather(String name){
		System.out.println("�Ҿƹ��� �̸��� "+name);
	}
}

class Father extends GrandFather{
	public Father(){
	//	super();
		System.out.println("���� �ƹ���");
	}
}

class Son extends Father{
	public Son(){
	//	super();
		System.out.println("���� �Ƶ�");
	}
}

class Extend_family1{
	public static void main(String ar[]){
		Son s=new Son();
	}
}