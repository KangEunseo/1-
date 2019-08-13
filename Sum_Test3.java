class Sum_Test3{
	int s=0;

	public int sum(){
		for(int i=1;i<6;i++){
			s+=i;
		}
		return(s);
	}

	public static void main(String ar[]){
		Sum_Test3 s3=new Sum_Test3();
		int a=s3.sum();
		System.out.println(a);
	}

}