import java.util.*;

class Account{

	private String Account_no; // 계좌번호
	private String owner; // 예금주
    private static String passwd="1111"; // 비밀번호
	private int money; // 입출금액
    private static int balance=0; // 잔액
	private int choose;
	Scanner sc=new Scanner(System.in);

	public String privacy_no(){   // 계좌정보입력(계좌번호)
	    System.out.print("계좌번호를 입력하세요. >> ");
		String acc=sc.next();
		this.Account_no=acc;
		return acc;
	}

	public String privacy_na(){   // 계좌정보입력(이름)
	    System.out.print("이름을 입력하세요. >> ");
		String name=sc.next();
		this.owner=name;
		return name;
	}

	public int cho(){   // 실행 선택
		System.out.println("======== Mirim Bank ========");
		System.out.print("[①입금]  [②출금]  [③계좌 확인]  [④시스템 종료] >>  ");
		int n=sc.nextInt();
		choose=n;
		return n;
	}

    public int deposit(){   // 입금
        System.out.print("얼마 입금하시겠습니까? >> ");
		this.money=sc.nextInt();
		this.balance+=this.money;
		System.out.println(this.money+"원 입금되었습니다.");
		return this.money;
	}

    public int withDraw(){   // 출금
	    System.out.print("얼마 출금하시겠습니까? >> ");
		this.money=sc.nextInt();
		System.out.print("비밀번호를 입력하세요. >> ");
		String p=sc.next();
		if (this.passwd.equals(p) && this.balance>=this.money){
			System.out.println(">>  "+this.money+"원이 출금되었습니다.");
			System.out.println();
			this.balance-=this.money;
			return this.money;
        }
		else if(this.money>this.balance){
			int n=this.money-this.balance;
			System.out.println("현재 잔액은 "+this.balance+"원이므로, "+n+"원이 부족합니다.");
			System.out.println();
			return this.balance;
		}
		else{
			System.out.print("비밀번호가 틀립니다.");
			System.out.println();
			return 0;
		}
	}

	public void check(String a, String b){  //계좌 확인
		System.out.println("계좌번호는 ["+a+"]입니다.");
		System.out.println("이름은 "+b+"입니다.");
		System.out.println("잔액은 "+this.balance+"원입니다.");
	}

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);

		Account a1=new Account();
		String acn=a1.privacy_no();
		String aow=a1.privacy_na();
		boolean b=true;
		do{
			a1.cho();
			switch(a1.choose){
			case 1 : a1.deposit();                break;
			case 2 : a1.withDraw();            break;
			case 3 : a1.check(acn, aow);    break;
			case 4 : b=false;                     break;
			}
		}
		while (b);
	}

}