import java.util.*;

class Array_Test4{
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);

		//5개의 정수값을 입력받아 배열에 넣고 최대값 구하기
		System.out.println("5개의 정수 중에서 최대값 찾기♥");
		int a[]=new int[5];
		for (int i=0; i<a.length; i++) {
			System.out.print("정수를 입력하세요. : ");
			a[i]=sc.nextInt();
		}
		int maxo=a[0];
		for (int i=1; i<a.length; i++) {
			if (maxo<a[i]) {
				maxo=a[i];
			}
		}
		System.out.println("최대값 : "+maxo);

		//10개의 정수값을 입력받아 배열에 넣고 최대값, 최소값 구하기
		System.out.println();
		System.out.println("10개의 정수 중에서 최대값, 최소값 찾기♥");
		int b[]=new int[10];
		for (int i=0; i<b.length; i++) {
			System.out.print("정수를 입력하세요. : ");
			b[i]=sc.nextInt();
		}
		int maxt=b[0], min=b[0];
		for (int i=1; i<b.length; i++) {
			if (maxt<b[i]) {
				maxt=b[i];
			}
			else if (min>b[i]) {
				min=b[i];
			}
		}
		System.out.println("최대값 : "+maxt+", 최소값 : "+min);
	}
}