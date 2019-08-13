import java.util.*;

class Scan_hw8 {
public static void main(String ar[]) {
	Scanner sc=new Scanner(System.in);
	System.out.print("정수 5개를 입력하세요. : ");
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
	System.out.println("짝수의 합 : "+j+" ,  홀수의 합 : "+h+"");
 }
}