class Absolutevalue_Test2{

	public void Abv(int a){
		if (a<0){
			a*=-1;
			System.out.println("�Է��� ���� ������ "+a+"�Դϴ�.");
		}
		else{
			System.out.println("�Է��� ���� ������ "+a+"�Դϴ�.");
		}
	}

	public static void main(String ar[]){
		Absolutevalue_Test2 a=new Absolutevalue_Test2();
		a.Abv(-7);
	}
}