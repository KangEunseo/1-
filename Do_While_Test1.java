class Do_While_Test1 {
	public static void main(String ar[]) {
		int i=1, sum=0;
		do {
			sum+=i;
			i++;
		}
		while (i<=5);
		System.out.println("1���� 5������ �� : "+sum);
	}
}