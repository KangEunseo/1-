class Car{
	String name;
	int num;
	String owner;
	String color;
	public void go(String a, String b){
		System.out.println(a+"과 "+b+"이 함께 가다");
	}
	public void stop(int a){
		System.out.println(a+"명이 멈추다");
	}
	public void drive(){
		System.out.println("운전하다");
	}
}