class Math1{

	public void Add(int x, int y){
		System.out.println(x+" + "+y+" = "+(x+y));
	}

	public void Sub(int x, int y){
		System.out.println(x+" - "+y+" = "+(x-y));
	}

	public void Mul(int x, int y){
		System.out.println(x+" * "+y+" = "+(x*y));
	}

	public void Div(int x, int y){
		System.out.println(x+" / "+y+" = "+(x/y));
	}

	public static void main(String ar[]){
		Math1 m=new Math1();
		m.Add(10, 5);
		m.Sub(10, 5);
		m.Mul(10, 5);
		m.Div(10, 5);
	}

}