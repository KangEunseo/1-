class student30{
	String name;
	int age;
	String phone;
	String skill;
	String addr;
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	public void setPhone(String phone){
		this.phone=phone;
	}
	public String getPhone(){
		return phone;
	}
	public void setSkill(String skill){
		this.skill=skill;
	}
	public String getSkill(){
		return skill;
	}
	public void setAddr(String addr){
		this.addr=addr;
	}
	public String getAddr(){
		return addr;
	}
	public void show(){
		System.out.println("�̸� : "+this.name);
		System.out.println("���� : "+this.age);
		System.out.println("�ڵ�����ȣ : "+this.phone);
		System.out.println("Ư�� : "+this.skill);
		System.out.println("�ּ� : "+this.addr);
	}
}