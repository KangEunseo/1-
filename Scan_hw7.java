import java.util.*;

class Scan_hw7 {
 public static void main(String ar[]) {
	 Scanner sc=new Scanner(System.in);
	 System.out.print("������ �Է��ϼ���. : ");
	 int n=sc.nextInt();
	 int sum=0;

	 for(int i=1;i<=n;i++){
		 if(i%5==0){
			 sum+=i;
		 }
	 }
	 System.out.println(sum);
 }
}