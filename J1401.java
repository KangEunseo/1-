import java.util.*;

class J1401{
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		String sub[]=new String[5];
		int num[]=new int[5], i, all=0, arr=0, maj=0, min=0;
		String search;

		System.out.println("5���� ������� �Է��ϼ��� >> :");
		for (i=0; i<sub.length; i++) {
			sub[i]=sc.next();
		}

		System.out.println();
		System.out.println("-----------------");
		System.out.println();

		System.out.println("5���� ������ �Է��ϼ��� >> :");
		for (i=0; i<num.length; i++) {
			num[i]=sc.nextInt();
			all+=num[i];
		}
		arr=all/5;
		maj=num[0];
		min=num[0];

		for (i=0; i<num.length; i++) {
			if (num[i]>maj)	{
			    maj=num[i];
			}
		    else if (num[i]<min)	{
		        min=num[i];
	     	} 
		}

		System.out.println();
		System.out.println("-----------------");
		System.out.println();

		System.out.println("���� ���� >> "+all);
		System.out.println("���� ��� >> "+arr);
		System.out.println("�ְ� ���� >> "+maj);
		System.out.println("���� ���� >> "+min);

		System.out.println();
		System.out.println("-----------------");
		System.out.println();

		while (true) {
			System.out.print("�˻��� ������� �Է��ϼ��� : ");
			search=sc.next();
			if (search.equals(sub[0])) {
				System.out.println(sub[0]+"�� ���� : "+num[0]);
			}
			else if (search.equals(sub[1])) {
				System.out.println(sub[1]+"�� ���� : "+num[1]);
			}
			else if (search.equals(sub[2])) {
				System.out.println(sub[2]+"�� ���� : "+num[2]);
			}
			else if (search.equals(sub[3])) {
				System.out.println(sub[3]+"�� ���� : "+num[3]);
			}
			else if (search.equals(sub[4])) {
				System.out.println(sub[4]+"�� ���� : "+num[4]);
			}
			else if (search.equals("�׸�")) {
				break;
			}
		}
	}
}