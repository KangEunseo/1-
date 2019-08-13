import java.util.*;

class Array_Test5{
	public static void main(String ar[]){
		Scanner a=new Scanner(System.in);
		int n[]=new int[5], temp=0;
		int i, j;

		for (i=0; i<n.length; i++) {
			System.out.print("정수를 입력하세요. : ");
			n[i]=a.nextInt();
		}

		for (i=0; i<n.length; i++) {
			System.out.print(n[i]+" ");
		}

		for (i=0; i<n.length; i++) {
			for (j=0; j<n.length; j++) {
				if (n[i]<n[j]) {
					temp=n[j];
					n[j]=n[i];
					n[i]=temp;
				}
			}
		}

		System.out.println();
		System.out.println("오름차순 정렬↓");
		for (i=0; i<n.length; i++) {
			System.out.print(n[i]+" ");
		}
		System.out.println();
	}
}