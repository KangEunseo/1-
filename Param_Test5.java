class Param_Test5 {
	public static void main(String ar[]) {
		System.out.println("100������ �ڿ����� �Է��ϼ��� : "+ar[0]);
		int a=Integer.parseInt(ar[0]), sum=0;

		if (a<101) {
			for (int i=1; i<=a; i++) {
		    	sum+=i;
		    }
			System.out.println("1���� "+a+"������ ��� : "+sum/a);
		}

		else {
			System.out.println("100������ �ڿ����� �ƴմϴ�. �����ϰڽ��ϴ�.");
		}
	}
}