import java.util.*;

class Two_For_Test5 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);

		System.out.print("������ �Է��ϼ���. : ");
		int n=sc.nextInt();

		for (int i = n; i >= 1; i--) {
			for (int j = n; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}