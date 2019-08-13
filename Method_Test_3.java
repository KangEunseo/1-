class Method_Test_3{

	public int even(){
		int n=10, sum=0;
		for (int i=1; i<=n; i++){
			if (i%2==0){
				sum+=i;
			}
		}
		return(sum);
	}

	public static void main(String ar[]){
		Method_Test_3 m=new Method_Test_3();
		System.out.println(m.even());
	}
}