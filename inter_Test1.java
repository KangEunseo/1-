interface Area{
	double PI=3.14;

	public double getArea(); //원의 면적
	public double getCircum(); //원의 둘레
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