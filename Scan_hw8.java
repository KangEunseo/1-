import java.util.*;

class Scan_hw8 {
public static void main(String ar[]) {
	Scanner sc=new Scanner(System.in);
	System.out.print("���� 5���� �Է��ϼ���. : ");
	int j=0, h=0;

	for(int i=1;i<=5;i++) {
		int a=sc.nextInt();
		if (a%2==0) {
			j+=a;
		}
		else if (a%2!=0) {
			h+=a;
		}
	}
	System.out.println("¦���� �� : "+j+" ,  Ȧ���� �� : "+h+"");
 }
}