import java.util.*;

class While_Test6 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);

		System.out.print("������ �� �� �Է��ϼ���. : ");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int j=0,h=0;

		while (n<=m) {
			if (n%2==0)	{
				j+=n;
				n++;
			}
			else if (n%2==1) {
				h+=n;
				n++;
			}
		}
			System.out.println("¦���� �� : "+j);
			System.out.println("Ȧ���� �� : "+h);
	}
}