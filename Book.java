class Book{
	private String title;
	private String author;
	private String publish;
	private int price;

	public Book(String t, String a, String pu, int pr){
		this.title=t;
		this.author=a;
		this.publish=pu;
		this.price=pr;
	}

	public Book(String t, String a, String pu){
		this.title=t;
		this.author=a;
		this.publish=pu;
	}

	public Book(String a, String pu, int pr){
		this.author=a;
		this.publish=pu;
		this.price=pr;
	}

	public Book(){
	}

	public void setTitle(String title){
		this.title=title;
	}

	public String getTitle(){
		return title;
	}

    public static void main(String ar[]){
		Book b1=new Book("a","aa","aaa",100);
		Book b2=new Book("b","bb","bbb");
		Book b3=new Book("cc","ccc",200);
		Book b4=new Book();

		b4.setTitle("d");
		System.out.println(b4.getTitle());
	}
}