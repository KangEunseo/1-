import java.util.*;

class Two_For_Test2 {
 public static void main(String ar[]) {
	 Scanner sc=new Scanner(System.in);

	 System.out.print("������ �Է��ϼ���. : ");
	 int i=sc.nextInt();
	 
	 for(int x = 1; x <= i; x++) {
		 for(int y = 1; y <= x; y++) {
			 System.out.print("*");
		 }
		 System.out.println("");
	 }
 }
}