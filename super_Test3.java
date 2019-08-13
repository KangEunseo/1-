class father{
	int i=100;
	public String method2(){
		String s="아빠 메서드";
		return s;
	}
}

class child2 extends father{
	int i=20;
	public int method1(){
		return super.i;
	}
	public String method2(){
		return super.method2();
	}
}

class super_Test3{
	public static void main(String ar[]){
		child2 c=new child2();
		System.out.println(c.method1());//100
		System.out.println(c.method2());//아빠 메서드
	}
}