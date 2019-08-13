class Absolutevalue_Test2{

	public void Abv(int a){
		if (a<0){
			a*=-1;
			System.out.println("입력한 수의 절댓값은 "+a+"입니다.");
		}
		else{
			System.out.println("입력한 수의 절댓값은 "+a+"입니다.");
		}
	}

	public static void main(String ar[]){
		Absolutevalue_Test2 a=new Absolutevalue_Test2();
		a.Abv(-7);
	}
}