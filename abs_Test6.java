abstract class Ship{
	public abstract int maxspeed();
	public abstract int passenger();
}

class yacht extends Ship{
	public int maxspeed(){
		return 800;
	}
	public int passenger(){
		return 300;
	}
}

class boat extends Ship{
	public int maxspeed(){
		return 400;
	}
	public int passenger(){
		return 20;
	}
}

class abs_Test6{
	public static void main(String ar[]){
		yacht y=new yacht();
		boat b=new boat();
		System.out.println("��Ʈ�� �ִ�ӵ� : "+y.maxspeed());
		System.out.println("��Ʈ�� ž���� �� : "+y.passenger()+"��");
		System.out.println("��Ʈ�� �ִ�ӵ� : "+b.maxspeed());
		System.out.println("��Ʈ�� ž���� �� : "+b.passenger()+"��");
	}
}