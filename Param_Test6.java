class Param_Test6 {
	public static void main(String ar[]) {
		int even=0, odd=0;
		System.out.print("10���� ������ �Է��ϼ��� : ");
		int a[]=new int[10];

		for (int i=0; i<10; i++) {
			System.out.print(ar[i]+" ");
			a[i]=Integer.parseInt(ar[i]);
		}
		System.out.println();

		for (int i=0; i<10; i++) {
			if (a[i]%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}

		System.out.println("�Է¹��� �� �� ¦���� ���� : "+even+"(��)");
		System.out.println("�Է¹��� �� �� Ȧ���� ���� : "+odd+"(��)");
	}
}