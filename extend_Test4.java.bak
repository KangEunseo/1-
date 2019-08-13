class Employee1{
	String name;
	String num;

	public Employee1(String name, String num){
		this.name=name;
		this.num=num;
	}

	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return name;
	}

	public void setNum(String num){
		this.num=num;
	}

	public String getNum(){
		return num;
	}

	public void computeSalary(){
		System.out.println(100*12);
	}
}

class SalariedEmployee extends Employee1{
	double salary;

	public SalariedEmployee(String name, String num){
		super(name, num);
	}

	public void setSalary(double salary){
		this.salary=salary;
	}

	public double getSalary(){
		return salary;
	}

	public void computeSalary(){
		System.out.println(salary*12);
	}
}

public class extend_Test4{
	public static void main(String ar[]){
		Employee1 e01=new Employee1("Sam", "01");
		SalariedEmployee e02=new SalariedEmployee("Bob", "02");

		System.out.println("이름 : "+e01.getName());
		System.out.println("사원번호 : "+e01.getNum());
		System.out.print("연봉 : ");
		e01.computeSalary();

		System.out.println("-----------------------------------------");

		System.out.println("이름 : "+e02.getName());
		System.out.println("사원번호 : "+e02.getNum());
		e02.setSalary(120.5);
		System.out.println("월급 : "+e02.getSalary());
		System.out.print("연봉 : ");
		e02.computeSalary();
	}
}