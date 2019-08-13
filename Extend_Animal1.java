class Extend_Animal1{
	public static void main(String ar[]){
		dog d=new dog("맥스", "지훈");
		System.out.println("이름 : "+d.name);
		System.out.println("주인 : "+d.owner);
		d.eat();
		d.bark();

		System.out.println();

		cat c=new cat("미미", "관린");
		System.out.println("이름 : "+c.name);
		System.out.println("주인 : "+c.owner);
		c.eat();
		c.scratch();

		System.out.println();

		sheep s=new sheep("양양", "양갱");
		System.out.println("이름 : "+s.name);
		System.out.println("주인 : "+s.owner);
		s.eat();
		s.cry();
	}
}