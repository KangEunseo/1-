class Animalhw{
	private String name;
    private String owner;
    int leg;

    public void eat() {
		System.out.println("ธิดู");
    }

    public Animalhw(String name, String owner, int leg){
		this.name=name;
		this.owner=owner;
		this.leg=leg;
	}

	public Animalhw(String owner, int leg){
		this.owner=owner;
		this.leg=leg;
	}

	public Animalhw(String name, String owner){
		this.name=name;
		this.owner=owner;
	}

	public Animalhw(String name){
		this.name=name;
	}

	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return name;
	}

	public void setOwner(String owner){
		this.owner=owner;
	}

	public String getOwner(){
		return owner;
	}

   public static void main(String ar[]) {
	   Animalhw a1=new Animalhw("lion","Mike",4);
       Animalhw a2=new Animalhw("Tom",4);
       Animalhw a3=new Animalhw("rabbit","Alice");
       Animalhw a4=new Animalhw("sheep");
       Animalhw a5=new Animalhw("dog","John");

	   a2.setName("cat");
	   System.out.println(a2.getName());

	   a4.setOwner("Jane");
	   System.out.println(a4.getOwner());
   }
}