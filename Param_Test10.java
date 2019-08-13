class Param_Test10 {
	public static void main(String ar[]) {
		int a[]=new int[6];
		for (int i=0; i<6; i++)	{
			System.out.println("수를 입력하세요 >> "+ar[i]);
			a[i]=Integer.parseInt(ar[i]);
			if (a[i]<0) {
				a[i]*=-1;
			}
		}

		for (int i=0; i<6; i++)	{
			System.out.println(i+1+"번째로 입력한 수의 절대값은 "+a[i]+"입니다~♡");
		}
	}
}