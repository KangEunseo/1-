//숫자맞추기 게임
import java.util.*;

class Test7 {
	public static void main(String ar[]) {
		Random r=new Random();
		Scanner sc=new Scanner(System.in);
		System.out.println("♡♡♡ 숫자맞추기 게임 ♡♡♡");
		System.out.println();

		int n=(int)(Math.random()*100+1);
		int a;
		int j=10;

		for (int i=1; i<=10; i++) {
			j--;
			System.out.println("♡♡♡ 100 이하의 정수를 입력하세요 ♡♡♡");
			a=sc.nextInt();
			if (n==a) {
				System.out.println("You win!!");
				break;
			}
			else if (n>a) {
				System.out.println("숫자가 입력한 수보다 더 커요. 기회가 "+j+"번 남았어요.");
			}
			else if (n<a) {
				System.out.println("숫자가 입력한 수보다 더 작아요. 기회가 "+j+"번 남았어요.");
			}
			if (i==10) {
				if (n!=a) {
					System.out.println("You lose...");
				}
			}
		}
	}
}