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
		System.out.println("요트의 최대속도 : "+y.maxspeed());
		System.out.println("요트의 탑승자 수 : "+y.passenger()+"명");
		System.out.println("보트의 최대속도 : "+b.maxspeed());
		System.out.println("보트의 탑승자 수 : "+b.passenger()+"명");
	}
}