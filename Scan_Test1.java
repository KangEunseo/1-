import java.util.*;

class Scan_Test1 {
public static void main(String ar[]) {

	Scanner sc=new Scanner(System.in);

	System.out.print("정수를 입력하세요. : ");
	int i=sc.nextInt();
	System.out.println("i = "+i);

	System.out.print("문자열을 입력하세요. : ");
	String s=sc.next();
	System.out.println(s);

	System.out.print("더블형을 입력하세요. : ");
	double d=sc.nextDouble();
	System.out.println(d);
}
}