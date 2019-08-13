import java.util.*;

class Do_While_Test3 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("정수를 입력하세요. : ");
		int n=sc.nextInt();
		int i=1, sum=0;

		do {
			sum+=i;
			i++;
		} while (i<=n);

		System.out.println("1부터 "+n+"까지의 합 : "+sum);
	}
}