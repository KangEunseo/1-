import java.util.*;

class Scan_hw5 {
 public static void main(String ar[]) {
	 Scanner sc=new Scanner(System.in);
	 System.out.print("1개의 자연수를 입력하세요. : ");
	 int n=sc.nextInt();

	 for(int i=1;i<=10;i++){
		 n*=i;
		 System.out.println(n);
		 n/=i;
	 }
 }
}