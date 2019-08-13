class Employee{
	private String name;
	private int salary;
	private String company;
	private String hiredate;

	public Employee(String n, int s, String c, String h){
		this.name=n;
		this.salary=s;
		this.company=c;
		this.hiredate=h;
	}

	public Employee(int s, String c){
		this.salary=s;
		this.company=c;
	}

	public Employee(String n, String c, String h){
		this.name=n;
		this.company=c;
		this.hiredate=h;
	}

	public int getSalary(){
		return (salary);
	}

	public void setHiredate(String s){
		this.hiredate=s;
	}

	public static void main(String ar[]){
		Employee e1=new Employee("Tom", 100, "han", "2018-03-01");
		Employee e2=new Employee(200, "kyun");
		Employee e3=new Employee("Alice", "Ame", "2018-07-03");

		e2.setHiredate("2017-08-07");
		System.out.println(e1.getSalary());

		System.out.println("이름 : "+e3.name+", 월급 : "+e3.salary+", 회사 : "+e3.company+", 입사년도 : "+e3.hiredate);
	}
}