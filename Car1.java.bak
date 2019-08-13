class Car1{
	private String brand;
	private String owner;
	private String company;
	private int price;

	public Car1(String b, String o, String c, int p) {
		this.brand=b;
		this.owner=o;
		this.company=c;
		this.price=p;
	}

	public Car1(String b, String o, int p) {
		this.brand=b;
		this.owner=o;
		this.price=p;
	}

	public String start(String s){
		return s;
	}

	public String stop(){
		return ("stop");
	}

	public String get(){
		return ("브랜드 : "+brand+", 차 주인 : "+owner+", 회사명 : "+company+", 가격 : "+price);
	}

	public static void main(String ar[]) {
		Car1 c1=new Car1("sonata", "Mike", "hyundai", 100);
		Car1 c2=new Car1("sm7", "Tom", "kia", 200);
		Car1 c3=new Car1("Benz", "Alice", 300);
		
		System.out.println(c3.get());

		System.out.println(c3.start("시작"));
		System.out.println(c3.stop());
	}
}