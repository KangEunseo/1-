class Absolutevalue_Test4{

	public int Abv(int a){
		if (a<0){
			a*=-1;
		}
		return(a);
	}

	public static void main(String ar[]){
		Absolutevalue_Test4 a=new Absolutevalue_Test4();
		System.out.println("�Է��� ���� ������ "+a.Abv(-7)+"�Դϴ�.");
	}
}