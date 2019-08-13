import java.util.*;

class Student_Addr{
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("인원을 입력하세요 >> ");
		int n=sc.nextInt();
		student30 s[]=new student30[n];
		System.out.println("=== 학생정보입력 ===");
		System.out.println("====================");
		for(int i=0;i<s.length;i++){
			s[i]=new student30();
			System.out.print("이름 >> ");
			s[i].setName(sc.next());
			System.out.print("나이 >> ");
			s[i].setAge(sc.nextInt());
			System.out.print("전화번호 >> ");
			s[i].setPhone(sc.next());
			System.out.print("특기 >> ");
			s[i].setSkill(sc.next());
			System.out.print("주소 >> ");
			s[i].setAddr(sc.next());
		}
		for(int i=0;i<s.length;i++){
			s[i].show();
		}
	}
}