class Extend_Car1{
	public static void main(String ar[]){
		FireEngine f=new FireEngine("벤츠", "kuanlin", "black");
		System.out.println("브랜드 : "+f.brand);
		System.out.println("주인 : "+f.owner);
		System.out.println("색 : "+f.color);
		f.start();
		f.stop();

		System.out.println();

		Amblance a=new Amblance("아우디", "jihoon", "white");
		System.out.println("브랜드 : "+a.brand);
		System.out.println("주인 : "+a.owner);
		System.out.println("색 : "+a.color);
		f.start();
		f.stop();
	}
}