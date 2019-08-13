import java.util.*;

class Do_While_Test4 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("이름과 나이를 입력하세요. : ");
		String s=sc.nextLine();
		System.out.print("정수를 입력하세요. : ");
		int n=sc.nextInt();
		int i=1;
		do {
			System.out.println(s);
			i++;
		} while (i<=n);
	}
}