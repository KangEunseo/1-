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
         System.out.println("�ش��⿡�� ����");
    }
}

class Baseball extends Sports{
    public void rule(){
         System.out.println("3�� �ƿ��̸� ��������");
    }
	public Baseball(String name, int player){
		super(name, player);
	}
}

class Basketball extends Sports{
    public void rule(){
         System.out.println("�Ŀ� 4���� ����");
    }
	public Basketball(String name, int player){
		super(name, player);
	}
}

class Extend_Sports{
	public static void main(String ar[]){
		Baseball b1=new Baseball("�߱�", 9);
		Basketball b2=new Basketball("��", 5);

		System.out.println("��� ���� : "+b1.getName());
		System.out.println("���� �ο� : "+b1.getPlayer());
		System.out.print("��� ��Ģ : ");
		b1.rule();

		System.out.println("-----------------------------------");

		System.out.println("��� ���� : "+b2.getName());
		System.out.println("���� �ο� : "+b2.getPlayer());
		System.out.print("��� ��Ģ : ");
		b2.rule();
	}
}