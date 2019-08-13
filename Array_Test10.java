class Array_Test10{
	public static void main(String ar[]){
		int n[]=new int[900];
		int count=0, sum=0;

		for (int i=0; i<n.length; i++) {
			n[i]=100+i;
			System.out.println(n[i]);
			if (n[i]%7==0) {
				count+=1;
				sum+=n[i];
			}
		}

		System.out.println("100에서 999까지의 수 중 7의 배수의 개수 : "+count+"(개)");
		System.out.println("100에서 999까지의 수 중 7의 배수의 합 : "+sum);
	}
}