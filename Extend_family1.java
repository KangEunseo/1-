class GrandFather{
	public GrandFather(){
		System.out.println("나는 할아버지");
	}

	public GrandFather(String name){
		System.out.println("할아버지 이름은 "+name);
	}
}

class Father extends GrandFather{
	public Father(){
	//	super();
		System.out.println("나는 아버지");
	}
}

class Son extends Father{
	public Son(){
	//	super();
		System.out.println("나는 아들");
	}
}

class Extend_family1{
	public static void main(String ar[]){
		Son s=new Son();
	}
}