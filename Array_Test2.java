class Array_Test2 {
	public static void main(String ar[]) {
		int arr[]=new int[3];
		boolean b[]=new boolean[5];

		System.out.println(arr);
		//arr���� ���� �迭(���)�� �ִ� �ּҰ��� ��µ�.

		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

		for (int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
	}
}