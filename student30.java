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
		System.out.println("이름 : "+this.name);
		System.out.println("나이 : "+this.age);
		System.out.println("핸드폰번호 : "+this.phone);
		System.out.println("특기 : "+this.skill);
		System.out.println("주소 : "+this.addr);
	}
}