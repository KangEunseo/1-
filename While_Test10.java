//가위바위보
import java.util.*;

class While_Test10 {
	public static void main(String ar[]) {
		Scanner a=new Scanner(System.in);
		Scanner b=new Scanner(System.in);
		Scanner d=new Scanner(System.in);

		while (true) {
			System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중 하나를 입력하세요.");
		    System.out.print("지훈 : ");
		    String w=a.nextLine();
		    System.out.print("관린 : ");
		    String p=b.nextLine();
                           if (w.equals("가위")) {
                             switch (p) {
                               case "바위":System.out.println("관린 승");
                                 break;
                               case "보":System.out.println("지훈 승");
                                 break;
								case "가위":System.out.println("무승부");
                                 break;
                             }
                           }
                           else if (w.equals("바위")) {
                             switch (p) {
                               case "가위":System.out.println("지훈 승");
                                 break;
                               case "보":System.out.println("관린 승");
                                 break;
							   case "바위":System.out.println("무승부");
                                 break;
                             }
                           }
                           else if (w.equals("보")) {
                             switch (p) {
                               case "가위":System.out.println("관린 승");
                                 break;
                               case "바위":System.out.println("지훈 승");
                                 break;
							   case "보":System.out.println("무승부");
                                 break;
                             }
                           }

				System.out.print("계속하시겠습니까? ( Y / N ) : ");
				char c=d.next().charAt(0);

				if (c=='N') {
					break;
				}
		}
	}
}