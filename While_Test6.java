import java.util.*;

class While_Test6 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);

		System.out.print("정수를 두 개 입력하세요. : ");
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
			System.out.println("짝수의 합 : "+j);
			System.out.println("홀수의 합 : "+h);
	}
}