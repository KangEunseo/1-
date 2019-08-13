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
		    System.out.println(" ♥포카리스웨트(700)     ♥콜라(900)     ♥사이다(800)     ♥코코팜(700)     ♥물(500)");
		    System.out.println("---------------------------------------------------------------------------------------");
		    
			System.out.print("음료를 주문하시겠습니까? (Y/N)  >>>>>  ");
			order=o.next().charAt(0);

		    	if (order=='Y') {
				   int money=0;
		           System.out.print("돈을 넣으세요. (원)  >>>>>  ");
		           add=m.nextInt();
                   money+=add;
				
				      if (500<money)	{
					     System.out.print("음료를 선택하세요. (음료명을 정확히 입력해주세요.)  >>>>>  ");
				         what=w.nextLine();
						 int wh=0;

						    if (what.equals("포카리스웨트") || what.equals("코코팜")) {
								wh+=700;
						    }
					       else if (what.equals("콜라")) {
							   wh+=900;
					       }
					       else if (what.equals("사이다")) {
							   wh+=800;
					       }
						   else if (what.equals("물")) {
							   wh+=500;
					       }

				             System.out.print("수량을 선택하세요. (개)  >>>>>  ");
				             number=n.nextInt();
							 int price=wh*number, balance=money-price;

					        if (price<=money) {
						        System.out.println("주문하신 음료는 "+what+"이며 수량은 "+number+"개, 잔돈은 "+balance+"원입니다.");
					        }
					        else {
						        System.out.println("돈을 더 넣어주세요.");
					        }
				      }
				      else {
					     System.out.println("돈을 더 넣어주세요.");
				      }
			    }
			    else {
				    break;
			    }
		}
	}
}