//�ٸ� �� ģ���� (�����)
import java.util.*;

class VendingMachine{
public static void main(String []args){
	
	System.out.println("1. �ݶ� (600��) 2. ���̴� (300��) 3.�� (200��) 4.������ (700��)");
	System.out.println();
	int coke = 600;
	int cider = 300;
	int water = 200;
	int cocopam = 700;

	Scanner sc = new Scanner (System.in);
	
	System.out.print("���� �ݾ��� �Է��ϼ��� : ");
	int money = sc.nextInt();
	System.out.println();

	while (true)
	{ System.out.print("���� ��ȣ�� �Է��ϼ��� : ");
	int number = sc.nextInt();
	System.out.println();

	System.out.print("������ �Է��ϼ��� : ");
	int amount = sc.nextInt();
	System.out.println();

	switch (number){
		case 1: money = money-coke*amount;break;
		case 2: money = money-cider*amount;break;
		case 3: money = money-water*amount;break;
		case 4: money = money-cocopam*amount;break;
		}

	System.out.println("�ܾ��� " + (money) + "�� �Դϴ�.");
	System.out.println();
	int FT = (money/5000);
	int OT = (money/1000);
	int FH = (money/500);
	int OH = (money/100);
	int Ten = (money/10);

	System.out.println("5000�� " + FT + "��, 1000�� " + (OT-(5*FT)) + "��, 500�� " + (FH-(2*OT)) + "��, 100�� " + (OH-(5*FH)) + "��, 10�� " + (Ten - 10*OH) + "��.");
	System.out.println();

	System.out.println("�߰� �ֹ� �Ͻðڽ��ϱ�? : ( y | n )");
	System.out.println();
	
	String s = sc.next();
	
	if (s.equals("n")){System.out.println("���ǱⰡ �����ϴ�.");break;}
	else if(s.equals("y")){continue;}
	else { System.out.println("�߸� �Է��ϼ̽��ϴ�.");
	}
	}	
}
}