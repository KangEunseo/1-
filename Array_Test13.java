import java.util.*;

class Array_Test13 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);

		System.out.print("10 이하의 자연수를 입력하세요 : ");
		int n[]=new int[sc.nextInt()];

		if (n.length<=10) {
	    	for (int i=0; i<n.length; i++) {
	   		   System.out.println("Daniel");
		    }
		}
		else {
			System.out.println("10 이하의 자연수가 아닙니다. 종료하겠습니다.");
		}
	}
}