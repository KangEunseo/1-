class Param_Test9 {
	public static void main(String ar[]) {
		int odd=0, even=0;

		for (int i=0; i<6; i++)	{
			System.out.println(i+1+"��° ���ڸ� �Է��ϼ��� : "+ar[i]);
			int a=Integer.parseInt(ar[i]);
			if (a%2==0) {
				even+=a;
			}
			else {
				odd+=a;
			}
		}

		System.out.println("�Է��� ���� �� ¦���� �� : "+even);
		System.out.println("�Է��� ���� �� Ȧ���� �� : "+odd);
	}
}