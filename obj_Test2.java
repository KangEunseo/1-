class obj_Test2 {
	public static void main(String ar[]) {
		Student s1=new Student();
		s1.name="jihoon";
		s1.grade=1;
		s1.study();
		s1.clean();

		System.out.println("�̸��� "+s1.name);
		System.out.println(s1.grade+"�г�");

		System.out.println();

		Student s2=new Student();
		s2.name="kuanlin";
		s2.grade=2;

		System.out.println("�̸��� "+s2.name);
		System.out.println(s2.grade+"�г�");
	}
}