import java.util.*;

class Array_Test3 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);

// 1�� ����. Ű���忡�� ���� 2���� �Է¹޾� ����� ū�� ���
		System.out.println("1�� ���� ��");

		int a[]=new int[2];
		
		for (int i=0; i<a.length; i++) {
			System.out.print("������ �Է��ϼ���. : ");
			a[i]=sc.nextInt();
		}

		if (a[0]>a[1]) {
			System.out.println("�� a[0]�ȿ� �ִ� �� "+a[0]+"��(��) �� a[1]�ȿ� �ִ� �� "+a[1]+"���� �� Ů�ϴ�.");
		}
		else if (a[0]<a[1]) {
            System.out.println("�� a[0]�ȿ� �ִ� �� "+a[0]+"��(��) �� a[1]�ȿ� �ִ� �� "+a[1]+"���� �� �۽��ϴ�.");
		}
		else {
			System.out.println("�� a[0]�ȿ� �ִ� �� "+a[0]+", �� a[1]�ȿ� �ִ� ��"+a[1]+" ==> �����ϴ�.");
		}
		System.out.println();

// 2�� ����. Ű���忡�� ������ 10�� �Է¹޾� �迭�� �����ϰ� �� �����߿��� 3�� ����� ��� ȭ�鿡 ���
		System.out.println("2�� ���� ��");

       int b[]=new int[10];

	   for (int i=0; i<b.length; i++) {
		   System.out.print("������ �Է��ϼ���. : ");
		   b[i]=sc.nextInt();
	   }
	   System.out.println();

	   for (int i=0; i<b.length; i++) {
		   if (b[i]%3==0) {
			   System.out.println(b[i]);
		   }
	   }
	}
}