class Extend_Car1{
	public static void main(String ar[]){
		FireEngine f=new FireEngine("����", "kuanlin", "black");
		System.out.println("�귣�� : "+f.brand);
		System.out.println("���� : "+f.owner);
		System.out.println("�� : "+f.color);
		f.start();
		f.stop();

		System.out.println();

		Amblance a=new Amblance("�ƿ��", "jihoon", "white");
		System.out.println("�귣�� : "+a.brand);
		System.out.println("���� : "+a.owner);
		System.out.println("�� : "+a.color);
		f.start();
		f.stop();
	}
}