class Sports{
    String name;
    int player;

    public Sports(String name, int player){
         this.name=name;
	     this.player=player;
    }

    public int getPlayer(){
         return player;
    }

    public String getName(){
         return name;
    }

    public void rule(){
         System.out.println("해당경기에서 정함");
    }
}

class Baseball extends Sports{
    public void rule(){
         System.out.println("3번 아웃이면 공수교대");
    }
	public Baseball(String name, int player){
		super(name, player);
	}
}

class Basketball extends Sports{
    public void rule(){
         System.out.println("파울 4개면 퇴장");
    }
	public Basketball(String name, int player){
		super(name, player);
	}
}

class Extend_Sports{
	public static void main(String ar[]){
		Baseball b1=new Baseball("야구", 9);
		Basketball b2=new Basketball("농구", 5);

		System.out.println("경기 종목 : "+b1.getName());
		System.out.println("선수 인원 : "+b1.getPlayer());
		System.out.print("경기 규칙 : ");
		b1.rule();

		System.out.println("-----------------------------------");

		System.out.println("경기 종목 : "+b2.getName());
		System.out.println("선수 인원 : "+b2.getPlayer());
		System.out.print("경기 규칙 : ");
		b2.rule();
	}
}