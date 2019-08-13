import java.util.*;

class Absolutevalue_Test1{
	Scanner sc=new Scanner(System.in);

	public void Abv(){
		System.out.print("정수를 입력하세요 >> ");
		int a=sc.nextInt();
		if (a<0){
			a*=-1;
			System.out.println("입력한 수의 절댓값은 "+a+"입니다.");
		}
		else{
			System.out.println("입력한 수의 절댓값은 "+a+"입니다.");
		}
	}

	public static void main(String ar[]){
		Absolutevalue_Test1 a=new Absolutevalue_Test1();
		a.Abv();
	}
}