class Person20{
	private String name;
	private String addr;
	private String tel;

	public Person20(String name, String addr, String tel){
		this.name=name;
		this.addr=addr;
		this.tel=tel;
	}

	public void setName(String name){
		this.name=name;
	}

	public void setAddr(String addr){
		this.addr=addr;
	}

	public void setTel(String tel){
		this.tel=tel;
	}

	public String getName(){
		return name;
	}

	public String getAddr(){
		return addr;
	}

	public String getTel(){
		return tel;
	}

	public String toString(){ //멤버변수를 출력하는 메서드
		return ("이름 : "+name+", 주소 : "+addr+", 전화번호 : "+tel);
	}
}

class Customer1 extends Person20{
	String number;
	int mileage;

	public Customer1(String name, String addr, String tel, String number, int mileage){
		super(name, addr, tel);
		this.number=number;
		this.mileage=mileage;
	}

	public String toString(){ //멤버변수를 출력하는 메서드
		return (super.toString()+", 고객번호 : "+number+", 마일리지 : "+mileage);
	}
}

class extend_Test6{
	public static void main(String ar[]){
		Customer1 c=new Customer1("Tom", "Seoul", "111", "222", 10);
		System.out.println("이름 : "+c.getName());
		System.out.println("마일리지 : "+c.mileage);
		System.out.println(c.toString());
	}
}