// 5. '1학년 4반'입력받아 5번 출력
import java.util.*;

class While_Test9 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);

		System.out.print("문자열을 입력하세요. : ");
		String s=sc.nextLine();

		for (int i=1; i<=5; i++) {
			System.out.println(s);
		}
	}
}