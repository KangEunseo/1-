class Method_Test_4{

	public int even(int n){
		int sum=0;
		for (int i=1; i<=n; i++){
			if (i%2==0){
				sum+=i;
			}
		}
		return(sum);
	}

	public static void main(String ar[]){
		Method_Test_4 m=new Method_Test_4();
		System.out.println(m.even(10));
	}
}