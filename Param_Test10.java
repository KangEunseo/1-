class Param_Test10 {
	public static void main(String ar[]) {
		int a[]=new int[6];
		for (int i=0; i<6; i++)	{
			System.out.println("���� �Է��ϼ��� >> "+ar[i]);
			a[i]=Integer.parseInt(ar[i]);
			if (a[i]<0) {
				a[i]*=-1;
			}
		}

		for (int i=0; i<6; i++)	{
			System.out.println(i+1+"��°�� �Է��� ���� ���밪�� "+a[i]+"�Դϴ�~��");
		}
	}
}