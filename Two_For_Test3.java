import java.util.*;

class Two_For_Test3
{
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);

		System.out.print("정수를 입력하세요. : ");
		int  n=sc.nextInt();

		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}