class Person10{
	String name;
	String addr;
	String tel;
	
	public Person10(String name, String addr, String tel){
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
}

class Customer extends Person10{
    String customNum;
	int mileage;

	public Customer(String name, String addr, String tel, String customNum, int mileage){
		super(name, addr, tel);
		this.customNum=customNum;
		this.mileage=mileage;
	}
}

public class extend_Test3{
	public static void main(String ar[]){
		Customer c1=new Customer("Tom", "101-412", "#82-622-8909", "10249304", 100);
		System.out.println(c1.getName());
		System.out.println(c1.getAddr());
		System.out.println(c1.getTel());
	}
}