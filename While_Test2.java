import java.util.*;

class While_Test2 {
 public static void main(String ar[]) {
	 Scanner sc=new Scanner(System.in);
	 System.out.print("������ �Է��ϼ���. : ");
	 int n=sc.nextInt();
	 int sum=0;
	 int i=1;

	 while (i<=n)
	 {
		 if (i%2==0)
		 {
			 sum+=i;
		 }
		 i++;
	 }
	 System.out.println(sum);
 }
}