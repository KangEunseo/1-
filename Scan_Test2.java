import java.util.*;

class Scan_Test2 {
 public static void main(String ar[]) {
	 Scanner sc=new Scanner(System.in);
	 System.out.print("������ �Է��Ͻÿ�. : ");
	 int n=sc.nextInt();
	 int a=1;

	 for(int i=1;i<=n;i++) {
		 a*=i;
	 }
	 System.out.println(a);
 }
}