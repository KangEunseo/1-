class Movie_Test{
	public static void main(String args[]){
		Movie m=new Movie();
		m.name="Midnight in Paris";
		m.time=7;
		m.price=6000;
		System.out.println("������ ��ȭ >> "+m.name+", "+m.time+"�ÿ� �󿵽���, ����� "+m.price+"��");
		m.watch();
		m.end();
	}
}