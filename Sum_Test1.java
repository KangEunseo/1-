class Sum_Test1{
	int s=0;

	public void sum(){
		for(int i=1;i<6;i++){
			s+=i;
		}
		System.out.println(s);
	}

	public static void main(String ar[]){
		Sum_Test1 s1=new Sum_Test1();
		s1.sum();
	}

}