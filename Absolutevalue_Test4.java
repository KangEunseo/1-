class Absolutevalue_Test4{

	public int Abv(int a){
		if (a<0){
			a*=-1;
		}
		return(a);
	}

	public static void main(String ar[]){
		Absolutevalue_Test4 a=new Absolutevalue_Test4();
		System.out.println("입력한 수의 절댓값은 "+a.Abv(-7)+"입니다.");
	}
}