class Food{
	int kcal;
	int price;
	int weight;

	Food(){ }

	Food(int kcal, int price, int weight){
		this.kcal=kcal;
		this.price=price;
		this.weight=weight;
	}

	public void setKcal(int kcal){
		this.kcal=kcal;
	}

	public int getKcal(){
		return kcal;
	}

	public void setPrice(int price){
		this.price=price;
	}

	public int getPrice(){
		return price;
	}

	public void setWeight(int weight){
		this.weight=weight;
	}

	public int getWeight(){
		return weight;
	}

	public String toString(){
		return ("Į�θ� : "+kcal+", ���� : "+price+", �߷� : "+weight);
	}
}

class Melon extends Food{
	String farm;

	Melon(){ }

	Melon(int kcal, int price, int weight, String farm){
		super(kcal, price, weight);
		this.farm=farm;
	}

	public void setFarm(String farm){
		this.farm=farm;
	}

	public String getFarm(){
		return farm;
	}

	public String toString(){
		return (super.toString()+", ���� ��� : "+farm);
	}
}

class extend_Test8{
	public static void main(String ar[]){
		Food f=new Food(300, 1300, 100);
		Melon m=new Melon(10, 1000, 130, "�������");
		System.out.println(f.toString());
		System.out.println(m.toString());
	}
}