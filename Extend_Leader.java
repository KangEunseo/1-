class Student7{
	String name;
	int Student_ID;
	String tel;
	String address;
	String department;
	public void study(){
		System.out.println("공부하다");
	}
	public void eat(){
		System.out.println("먹다");
	}
	public void test(){
		System.out.println("시험보다");
	}
	public void act(){
		System.out.println("활동하다");
	}
}

class Leader extends Student7 {
    boolean PoN;
	public Leader(String name, int Student_ID, String tel,	String address, String department, boolean PoN){
		this.name=name;
		this.Student_ID=Student_ID;
		this.tel=tel;
		this.address=address;
		this.department=department;
		this.PoN=PoN;
	}
    public void hello(){
		System.out.println("인사하다");
	}
}

class Extend_Leader{
	public static void main(String ar[]){
		Leader l=new Leader("강은서", 1401, "010-1111-2222", "서울시 양천구 신정동", "웹솔루션과", false);
		System.out.println("이름 : "+l.name);
		System.out.println("학번 : "+l.Student_ID);
		System.out.println("전화번호 : "+l.tel);
		System.out.println("주소 : "+l.address);
		System.out.println("학과 : "+l.department);
		System.out.println("회장여부 : "+l.PoN);
		l.study();
		l.eat();
		l.test();
		l.act();
		l.hello();
	}
}