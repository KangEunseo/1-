class Phone{
	String manufacturer;
	int price;
	String type;

	Phone(){ }

	Phone(String manufacturer, int price, String type){
		this.manufacturer=manufacturer;
		this.price=price;
		this.type=type;
	}

	public void setManufacturer(String manufacturer){
		this.manufacturer=manufacturer;
	}

	public String getManufacturer(){
		return manufacturer;
	}

	public void setPrice(int price){
		this.price=price;
	}

	public int getPrice(){
		return price;
	}

	public void setType(String type){
		this.type=type;
	}

	public String getType(){
		return type;
	}

	public String toString(){
		return ("제조사 : "+ manufacturer+", 가격 : "+price+",통신타입 : "+type);
	}
}

class SmartPhone extends Phone{
	String os_type;
	String os_ver;
	int memory;
	String camera;
	String blootuth;

	SmartPhone(){ }

	SmartPhone(String manufacturer, int price, String type, String os_type, String os_ver, int memory, String camera, String blootuth){
		super(manufacturer, price, type);
		this.os_type=os_type;
		this.os_ver=os_ver;
		this.memory=memory;
		this.camera=camera;
		this.blootuth=blootuth;
	}

	public void setOs_type(String os_type){
		this.os_type=os_type;
	}

	public String getOs_type(){
		return os_type;
	}

	public void setOs_ver(String os_ver){
		this.os_ver=os_ver;
	}

	public String getOs_ver(){
		return os_ver;
	}

	public void setMemory(int memory){
		this.memory=memory;
	}

	public int getMemory(){
		return memory;
	}

	public void setCamera(String camera){
		this.camera=camera;
	}

	public String getCamera(){
		return camera;
	}

	public void setBlootuth(String blootuth){
		this.blootuth=blootuth;
	}

	public String getBlootuth(){
		return blootuth;
	}

	public String toString(){
		return (super.toString()+", 운영체제 타입 : "+os_type+", 운영체제 버전 : "+os_ver+", 메모리 용량 : "+memory+", 카메라 여부 : "+camera+", 블루투스 여부 : "+blootuth);
	}
}

public class extend_Test7{
	public static void main(String ar[]){
		Phone p1=new Phone("apple", 200000, "2g");
		SmartPhone p2=new SmartPhone("samsung", 100000, "2g", "window", "0.1.2", 64, "o", "x");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}
}