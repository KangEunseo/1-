class Array_Test12{
	public static void main(String ar[]){
		int n[]=new int[30];
		int odd_sum=0, even_sum=0;

		for (int i=0; i<n.length; i++) {
			n[i]=i+1;
			if (n[i]%2==0) {
				even_sum+=n[i];
			}
			else {
				odd_sum+=n[i];
			}
		}

		System.out.println("1부터 30까지 짝수의 합 : "+even_sum);
		System.out.println("1부터 30까지 홀수의 합 : "+odd_sum);
	}
}