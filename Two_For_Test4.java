class Two_For_Test4 {
	public static void main(String ar[]) {
		for (int m = 1; m <= 12; m++) {
			if (m % 2 == 1) {
				System.out.print(m+"�� : ");
				for (int d = 1; d <= 31; d++) {
					System.out.print(d+"�� ");
				}
			}
			else {
				System.out.print(m+"�� : ");
				for (int d = 1; d <= 30; d++) {
					System.out.print(d+"�� ");
				}
			}
			System.out.println();
		}
	}
}