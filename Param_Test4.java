class Param_Test4 {
	public static void main(String ar[]) {
		System.out.println("������ �Է��ϼ��� : "+ar[0]);
		int sum=0;
		int a=Integer.parseInt(ar[0]);

		for (int i=1; i<=a; i++)	{
			if (i%5==0) {
				sum+=i;
			}
		}

		System.out.println("1���� "+a+"������ �� �� 5�� ����� �� : "+sum);
	}
}