import java.util.*;

class Do_While_Test4 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("�̸��� ���̸� �Է��ϼ���. : ");
		String s=sc.nextLine();
		System.out.print("������ �Է��ϼ���. : ");
		int n=sc.nextInt();
		int i=1;
		do {
			System.out.println(s);
			i++;
		} while (i<=n);
	}
}