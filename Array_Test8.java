import java.util.*;

class Array_Test8{
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		int n[]=new int[5], j=0, h=0;

		for (int i=0; i<n.length; i++) {
			System.out.print("정수를 입력하세요 : ");
			n[i]=sc.nextInt();
			if (n[i]%2==0) {
				j+=n[i];
			}
			else if (n[i]%2==1) {
				h+=n[i];
			}
		}

		System.out.print("짝수의 합 = "+j+", ");
		System.out.print("홀수의 합 = "+h);
	}
}