class Car3{
	String carname;
	String color;
	int velocity; //�ӵ�
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
		return(w+"�� ���� �� �ִ�.");
	}
}

class Extend_Car3{
	public static void main(String ar[]){
		Frontier f=new Frontier();
		f.carname="����Ƽ��";
		f.velocity=10;
		f.Set_color("������");
		System.out.println("���� Ʈ���� "+f.color+"�̴�.");
		System.out.println(f.carname+"�� "+f.weight("3��"));
		f.speedUp();
		System.out.println(f.velocity);
		f.speedDown();
		System.out.println(f.velocity);
	}
}