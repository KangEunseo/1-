import java.util.*;

class Absolutevalue_Test3{
Scanner sc=new Scanner(System.in);

	public int Abv(){
		System.out.print("������ �Է��ϼ��� >> ");
		int a=sc.nextInt();
		if (a<0){
			a*=-1;
		}
		return(a);
	}

	public static void main(String ar[]){
		Absolutevalue_Test3 a=new Absolutevalue_Test3();
		System.out.println("�Է��� ���� ������ "+a.Abv()+"�Դϴ�.");
	}
}