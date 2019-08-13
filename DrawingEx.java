class Shape{
	public void draw(){
		System.out.println("도형 그리기");
	}
	public void painting(){
		System.out.println("원 색칠하기");
	}
}

class Circle extends Shape{
	String name="원";
	public void draw(){
		System.out.println("원 그리기");
	}
	public void painting(){
		System.out.println("원 색칠하기");
	}
}

class DrawingEx{
	public static void main(String ar[]){

	//	Shape s=new Shape();
	//	s.draw(); //도형그리기 출력
	//	s.painting(); //컴파일 에러

	//	Circle c=new Circle();
	//	c.draw(); //원그리기 출력
	//	c.painting(); //원색칠하기 출력

		Shape s2=new Circle(); //upcasting
		s2.draw(); //원그리기 출력
		s2.painting(); //에러, 부모가 자식메서드 접근 불가능
		//이걸 가능하게 해주는 것 => 가상메서드
		//부모에다 오버라이딩
	}
}