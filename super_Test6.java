class Employee30{
	String name;
	int num;

	public Employee30(String name, int num){
		this.name=name;
		this.num=num;
	}

	public void setName(String name){
		this.name=name;
	}

	public void setNum(int num){
		this.num=num;
	}

	public String getName(){
		return name;
	}

	public int getNum(){
		return num;
	}

	public void computeSalary(){
		System.out.println(250*12);
	}
}

class SalariedEmployee1 extends Employee30{
	double salary;

	public SalariedEmployee1(String name, int num, double salary){
		super(name, num);
		this.salary=salary;
	}

	public void computeSalary(){
		System.out.println(salary*12);
	}
}

class super_Test6{
	public static void main(String ar[]){
		SalariedEmployee1 s=new SalariedEmployee1("Jihoon", 529, 300);
		System.out.print("¡ˆ»∆¿Ã¿« ø¨∫¿ : ");
		s.computeSalary();
	}
}