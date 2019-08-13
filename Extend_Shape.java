class Shape{
	int x;
	int y;
	public void setArea(){}
	public int getArea(){ return 0; }
}

class Circle extends Shape{
	public void setArea(int a){ //반지름 a
		x=a;
	}
	public int getArea(){
		double a=(x*1.0)*(x*1.0)*3.14;
		return (int)a;
	}
}

class Rect extends Shape{
	public void setArea(int a, int b){ //가로, 세로
		x=a;
		y=b;
	}
	public int getArea(){
		return(x*y);
	}
}

class Diamond extends Shape{ //평행사변형
    public void setArea(int a, int b){ //밑변의 길이, 높이
		x=a;
		y=b;
	}
    public int getArea(){
		return(x*y);
	}
}

class Extend_Shape{
	public static void main(String ar[]){
		Circle c=new Circle();
		c.setArea(3);
		System.out.println("반지름이 3인 원의 넓이 : "+c.getArea());
		Rect r=new Rect();
		r.setArea(2,5);
		System.out.println("가로 2, 세로 5인 직사각형의 넓이 : "+r.getArea());
		Diamond d=new Diamond();
		d.setArea(3,7);
		System.out.println("밑변의 길이 3, 높이 7인 평행사변형의 넓이 : "+d.getArea());
	}
}