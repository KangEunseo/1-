class Movie1{
	String name;
	String director;
	String producer;

	Movie1(){ }

	Movie1(String name, String director, String producer){
		this.name=name;
		this.director=director;
		this.producer=producer;
	}

	public String toString(){
		return ("�̸� : "+name+", ���� : "+director+", ������ : "+producer);
	}

	public static void main(String ar[]){
		Movie1 m=new Movie1("����̾� ���ҵ�", "����", "����");
		System.out.println(m.toString());
	}
}