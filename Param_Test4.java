class Param_Test4 {
	public static void main(String ar[]) {
		System.out.println("정수를 입력하세요 : "+ar[0]);
		int sum=0;
		int a=Integer.parseInt(ar[0]);

		for (int i=1; i<=a; i++)	{
			if (i%5==0) {
				sum+=i;
			}
		}

		System.out.println("1부터 "+a+"까지의 수 중 5의 배수의 합 : "+sum);
	}
}