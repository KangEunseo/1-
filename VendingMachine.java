//다른 반 친구꺼 (참고용)
import java.util.*;

class VendingMachine{
public static void main(String []args){
	
	System.out.println("1. 콜라 (600원) 2. 사이다 (300원) 3.물 (200원) 4.코코팜 (700원)");
	System.out.println();
	int coke = 600;
	int cider = 300;
	int water = 200;
	int cocopam = 700;

	Scanner sc = new Scanner (System.in);
	
	System.out.print("넣을 금액을 입력하세요 : ");
	int money = sc.nextInt();
	System.out.println();

	while (true)
	{ System.out.print("음료 번호를 입력하세요 : ");
	int number = sc.nextInt();
	System.out.println();

	System.out.print("수량을 입력하세요 : ");
	int amount = sc.nextInt();
	System.out.println();

	switch (number){
		case 1: money = money-coke*amount;break;
		case 2: money = money-cider*amount;break;
		case 3: money = money-water*amount;break;
		case 4: money = money-cocopam*amount;break;
		}

	System.out.println("잔액은 " + (money) + "원 입니다.");
	System.out.println();
	int FT = (money/5000);
	int OT = (money/1000);
	int FH = (money/500);
	int OH = (money/100);
	int Ten = (money/10);

	System.out.println("5000원 " + FT + "개, 1000원 " + (OT-(5*FT)) + "개, 500원 " + (FH-(2*OT)) + "개, 100원 " + (OH-(5*FH)) + "개, 10원 " + (Ten - 10*OH) + "개.");
	System.out.println();

	System.out.println("추가 주문 하시겠습니까? : ( y | n )");
	System.out.println();
	
	String s = sc.next();
	
	if (s.equals("n")){System.out.println("자판기가 꺼집니다.");break;}
	else if(s.equals("y")){continue;}
	else { System.out.println("잘못 입력하셨습니다.");
	}
	}	
}
}