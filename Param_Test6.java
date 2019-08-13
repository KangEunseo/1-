class Param_Test6 {
	public static void main(String ar[]) {
		int even=0, odd=0;
		System.out.print("10개의 정수를 입력하세요 : ");
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

		System.out.println("입력받은 수 중 짝수의 개수 : "+even+"(개)");
		System.out.println("입력받은 수 중 홀수의 개수 : "+odd+"(개)");
	}
}