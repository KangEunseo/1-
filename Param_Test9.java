class Param_Test9 {
	public static void main(String ar[]) {
		int odd=0, even=0;

		for (int i=0; i<6; i++)	{
			System.out.println(i+1+"번째 숫자를 입력하세요 : "+ar[i]);
			int a=Integer.parseInt(ar[i]);
			if (a%2==0) {
				even+=a;
			}
			else {
				odd+=a;
			}
		}

		System.out.println("입력한 숫자 중 짝수의 합 : "+even);
		System.out.println("입력한 숫자 중 홀수의 합 : "+odd);
	}
}