abstract class Animal{
	String name;
	public void go(){
		System.out.println("가다");
	}
	abstract public String eat();
	abstract public void sleep();
}

class cat extends Animal{	// 자식의 의무 : 부모의 추상메서드의 몸통 만들기
	public String eat(){
		return("먹다");
	}
	public void sleep(){
		System.out.println("자다");
	}
}

class abs_Test1{
	public static void main(String ar[]){
		cat c=new cat();
		System.out.println(c.eat());
		c.sleep();
	}
}