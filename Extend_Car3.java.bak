class Car3{
	String carname;
	String color;
	int velocity; //속도
	public void speedUp(){
		velocity+=5;
	}
	public void speedDown(){
		velocity-=5;
	}
}

class Frontier extends Car3{
	public void Set_color(String c){
		this.color=c;
	}
	public String weight(String w){
		return(w+"을 실을 수 있다.");
	}
}

class Extend_Car3{
	public static void main(String ar[]){
		Frontier f=new Frontier();
		f.carname="프론티어";
		f.velocity=10;
		f.Set_color("검정색");
		System.out.println("나의 트럭은 "+f.color+"이다.");
		System.out.println(f.carname+"는 "+f.weight("3톤"));
		f.speedUp();
		System.out.println(f.velocity);
		f.speedDown();
		System.out.println(f.velocity);
	}
}