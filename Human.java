class Human{
	String name;
	int age;
	String ancestor;
	String fur;
	String bloodtype;
	String birthday;
	
	public Human(){ }

	public Human(String name, int age){
		this.name=name;
		this.age=age;
	}

	public Human(String name, int age, String ancestor, String fur, String bloodtype, String birthday){
		this.name=name;
		this.age=age;
		this.name=ancestor;
		this.fur=fur;
		this.bloodtype=bloodtype;
		this.birthday=birthday;
	}

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

	public void setAncestor(String ancestor){
		this.ancestor=ancestor;
	}

	public String getAncestor(){
		return ancestor;
	}

	public void setFur(String fur){
		this.fur=fur;
	}

	public String getFur(){
		return fur;
	}

	public void setBloodtype(String bloodtype){
		this.bloodtype=bloodtype;
	}

	public String getBloodtype(){
		return bloodtype;
	}

	public void setBirthday(String birthday){
		this.birthday=birthday;
	}

	public String getBirthday(){
		return birthday;
	}

	public String toString(){
		return ("ÀÌ¸§ : "+this.name+", ³ªÀÌ : "+this.age+", Á¶»ó : "+this.ancestor+", ÅÐ »ö : "+this.fur+", Ç÷¾×Çü : "+this.bloodtype+", »ýÀÏ : "+this.birthday);
	}

	public static void main(String ar[]){
		Human h1=new Human("ÃáÇâ", 18);
		Human h2=new Human("¸ù·æ", 21);
		Human h3=new Human("»ç¶Ç", 50);
		System.out.println(h1.toString());
		System.out.println(h2.toString());
		System.out.println(h3.toString());
	}
}