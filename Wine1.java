class Wine1{
	private String manufacturer;
	private String name;
	private String country;
	private String region;
	private String kind;
	private int year;
	private int grade;

	Wine1(String manufacturer, String name){
		this.manufacturer=manufacturer;
		this.name=name;
	}

	Wine1(String manufacturer, String name, String country, String region, String kind, int year, int grade){
		this.manufacturer=manufacturer;
		this.name=name;
		this.country=country;
		this.region=region;
		this.kind=kind;
		this.year=year;
		this.grade=grade;
	}

	public String toString(){
		return ("제조업체 : "+manufacturer+", 이름 : "+name+", 나라 : "+country+", 지역 : "+region+", 종류 : "+kind+", 년도 : "+year+", 등급 : "+grade);
	}

	public static void main(String ar[]){
		Wine1 w1=new Wine1("a", "n1");
		Wine1 w2=new Wine1("b", "n2", "italy", "몰라", "white wine", 1999, 100);
		System.out.println(w1.toString());
		System.out.println(w2.toString());
	}
}