import java.util.*;

class While_Test1 {
 public static void main(String ar[]) {
	 Scanner sc=new Scanner(System.in);
	 System.out.print("정수를 입력하세요. : ");
	 int n=sc.nextInt();
	 int i=1;

	 while (i<=9)
	 {
		 System.out.println(n*i);
		 i++;
	 }
 }
}