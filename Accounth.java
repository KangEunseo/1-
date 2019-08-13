//혜정이가 한 것
import java.util.*;
class Accounth {
	Scanner sc = new Scanner(System.in);
		private String account_NO; // 계좌번호
		private String name; // 예금주
		private String password = "1111"; // 비밀번호
		private int balance; // 잔고

		public String input() {
			System.out.print("계좌번호를 입력해주세요 : ");
			String in = sc.next();
			return in;
		} //input

		public String BankName() {
			System.out.print("예금주를 입력해주세요 : ");
			String in = sc.next();
			return in;
		} //BankName
		
		public int deposit() {
			System.out.print("\n얼마 입금하시겠습니까 ? ");
			int n = sc.nextInt();
			System.out.println(n + "원 입금되셨습니다.");
			return n;
		} // deposit

		public int withDraw(int money, String ps) {
			System.out.print("\n얼마 출금하시겠습니까 ? ");
			int n = sc.nextInt(); //출금 금액
			if(n<=money) {
				int i = 0;
				while (i < 3) {
				System.out.print("비밀번호를 입력해주세요 : ");
				String psw = sc.next();

					if(psw.equals(ps)) {
						System.out.println(n + "원이 출금되셨습니다.\n");
						return (money - n);
					}
					else {
						i++;
						System.out.print(i + "회 오류 : ");
					}
				}
				return money;
			}
			else {
				System.out.println("잔액이 부족합니다.\n");
				return money;
			}
		} //withDraw

		public void Check(String aa, String bb, int cc) {
			System.out.println("계좌번호는 " + aa + " 입니다.");
			System.out.println("예금주는 " + bb + " 님입니다.");
			System.out.println("잔액은 " + cc + "원입니다.");
		} //Check

		public static void main(String ar[]) {
			Scanner sc = new Scanner(System.in);
			Accounth ac = new Accounth();
			ac.account_NO = ac.input();
			ac.name = ac.BankName();
			boolean tf = true;
			do {  // 지정하기 보분 안됌 다시 할것
				System.out.print("++   1. 계좌정보 확인  2. 입금  3. 출금  4.시스템 종료   ++  ");
				String menu = sc.next();
				switch(menu){
					case "1" : ac.Check(ac.account_NO, ac.name, ac.balance); break;
					case "2" : ac.balance = ac.deposit(); break;
					case "3" : ac.balance = ac.withDraw(ac.balance, ac.password); break;
					case "4" : tf = false;
				}
			} while (tf); 
		} 
}