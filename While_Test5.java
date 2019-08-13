import java.util.*;

class While_Test5 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);

		System.out.print("정수를 입력하세요. : ");
		int n=sc.nextInt();
		int i=1;

		while (i<=n) {
			if (i%3==0) {
				System.out.println("3의 배수 "+i);
			}
			i++;
		}
	}
}