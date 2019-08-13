import java.util.*;

class Two_Array_Test2{
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		int a[][],i,j;
		a=new int[5][6];

		for (i=0; i<a.length; i++)
		{
			for (j=0; j<4; j++) {
				if (j==0) {
					System.out.print("학번을 입력하세요. =>  ");
					a[i][j]=sc.nextInt();
				}
				else if (j==1) {
					System.out.print("국어점수를 입력하세요. =>  ");
					a[i][j]=sc.nextInt();
				}
				else if (j==2) {
					System.out.print("영어점수를 입력하세요. =>  ");
					a[i][j]=sc.nextInt();
				}
				else if (j==3) {
					System.out.print("수학점수를 입력하세요. =>  ");
					a[i][j]=sc.nextInt();
				}
			}
			for (int o=1; o<4; o++) {
				a[i][4]+=a[i][o];
			}
			a[i][5]=a[i][4]/3;
			System.out.println();
		}

		System.out.println("학번   국어  영어  수학  총점  평균");

		for (i=0; i<a.length; i++) {
			for (j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+"    ");
			}
			System.out.println();
		}
	}
}