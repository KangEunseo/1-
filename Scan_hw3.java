import java.util.*;

class Scan_hw3 {
 public static void main(String ar[]) {

	 Scanner sc=new Scanner(System.in);
	 System.out.print("점수를 입력하세요. : ");

	 int i=sc.nextInt();
	 if(i>=60){System.out.println("합격");}
	 else{System.out.println("불합격");}
 }
}