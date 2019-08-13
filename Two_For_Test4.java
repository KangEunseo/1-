class Two_For_Test4 {
	public static void main(String ar[]) {
		for (int m = 1; m <= 12; m++) {
			if (m % 2 == 1) {
				System.out.print(m+"월 : ");
				for (int d = 1; d <= 31; d++) {
					System.out.print(d+"일 ");
				}
			}
			else {
				System.out.print(m+"월 : ");
				for (int d = 1; d <= 30; d++) {
					System.out.print(d+"일 ");
				}
			}
			System.out.println();
		}
	}
}