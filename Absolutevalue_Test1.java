import java.util.*;

class Absolutevalue_Test1{
	Scanner sc=new Scanner(System.in);

	public void Abv(){
		System.out.print("������ �Է��ϼ��� >> ");
		int a=sc.nextInt();
		if (a<0){
			a*=-1;
			System.out.println("�Է��� ���� ������ "+a+"�Դϴ�.");
		}
		else{
			System.out.println("�Է��� ���� ������ "+a+"�Դϴ�.");
		}
	}

	public static void main(String ar[]){
		Absolutevalue_Test1 a=new Absolutevalue_Test1();
		a.Abv();
	}
}