interface Buyable{
	public int getPrice();
}

class Television implements Buyable{
	String model;
	String maker;
	int price;

	Television(){ }

	Television(String model, String maker, int price){
		this.model=model;
		this.maker=maker;
		this.price=price;
	}

	public void setModel(String model){
		this.model=model;
	}

	public String getModel(){
		return model;
	}

	public void setMaker(String maker){
		this.maker=maker;
	}

	public String getMaker(){
		return maker;
	}

	public void setPrice(int price){
		this.price=price;
	}

	public int getPrice(){
		return price;
	}

	public String toString(){
		return("모델: "+model+", 제조사: "+maker+", 가격: "+price);
	}

	public static void main(String ar[]){
		Television t=new Television("KV-102", "LG", 300);
		System.out.println(t.toString());
	}
}