class Param_Test8 {
	public static void main(String ar[]) {
		System.out.println("�ڿ��� �� ���� �Է��ϼ��� : "+ar[0]);
		int multiple=1, a=Integer.parseInt(ar[0]);
		
		for (int i=1; i<=10; i++) {
			multiple=a*i;
			System.out.print(multiple+" ");
		}
		System.out.println();
	}
}