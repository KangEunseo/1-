interface Area{
	double PI=3.14;

	public double getArea(); //���� ����
	public double getCircum(); //���� �ѷ�
}

class A implements Area{
	public double getArea(){
		return PI*5*5;
	}
	public double getCircum(){
		return PI*10;
	}
}

class inter_Test1{
	public static void main(String ar[]){
		A a=new A();
		System.out.println(a.getArea());
		System.out.println(a.getCircum());
	}
}