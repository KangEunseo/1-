import java.util.*;

class Vending_machine{
	public static void main(String ar[]){
		Scanner o=new Scanner(System.in), m=new Scanner(System.in), w=new Scanner(System.in);
		Scanner n=new Scanner(System.in);
		int number, add;
		String what;
		char order;

		while (true) {
			System.out.println("---------------------------------------------------------------------------------------");
		    System.out.println(" ����ī������Ʈ(700)     ���ݶ�(900)     �����̴�(800)     ��������(700)     ����(500)");
		    System.out.println("---------------------------------------------------------------------------------------");
		    
			System.out.print("���Ḧ �ֹ��Ͻðڽ��ϱ�? (Y/N)  >>>>>  ");
			order=o.next().charAt(0);

		    	if (order=='Y') {
				   int money=0;
		           System.out.print("���� ��������. (��)  >>>>>  ");
		           add=m.nextInt();
                   money+=add;
				
				      if (500<money)	{
					     System.out.print("���Ḧ �����ϼ���. (������� ��Ȯ�� �Է����ּ���.)  >>>>>  ");
				         what=w.nextLine();
						 int wh=0;

						    if (what.equals("��ī������Ʈ") || what.equals("������")) {
								wh+=700;
						    }
					       else if (what.equals("�ݶ�")) {
							   wh+=900;
					       }
					       else if (what.equals("���̴�")) {
							   wh+=800;
					       }
						   else if (what.equals("��")) {
							   wh+=500;
					       }

				             System.out.print("������ �����ϼ���. (��)  >>>>>  ");
				             number=n.nextInt();
							 int price=wh*number, balance=money-price;

					        if (price<=money) {
						        System.out.println("�ֹ��Ͻ� ����� "+what+"�̸� ������ "+number+"��, �ܵ��� "+balance+"���Դϴ�.");
					        }
					        else {
						        System.out.println("���� �� �־��ּ���.");
					        }
				      }
				      else {
					     System.out.println("���� �� �־��ּ���.");
				      }
			    }
			    else {
				    break;
			    }
		}
	}
}