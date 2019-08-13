class Rectangle{

	int x1;
	int y1;
	int x2;
	int y2;

	public Rectangle() {}

	public Rectangle(int x1, int y1, int x2, int y2){
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}

	public void set(int x1, int y1, int x2, int y2){
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}

	public int square(){
		int wid=x1-x2;
	    int hei=y1-y2;
		int area=wid*hei;
		if (area<0)	{
			return(area*-1);
		}
		else {
			return area;
		}
	}

	public void show(){
		int wid=x1-x2;
	    int hei=y1-y2;
		int area=wid*hei;
		System.out.println("ÁÂÇ¥ |  x1 = "+x1+", y1 = "+y1+", x2 = "+x2+", y2 = ");
		if (area<0)	{
			System.out.println("³ĞÀÌ = "+(-1*area));
		}
		else {
			System.out.println("³ĞÀÌ = "+area);
		}
		System.out.println();
	}

	public static void main(String args[]){
		Rectangle r=new Rectangle();
		Rectangle s=new Rectangle(1, 1, 2, 3);
		r.show();
		s.show();
		System.out.println(s.square());
		r.set(-2, 2, -1, 4);
		r.show();
		System.out.println(r.square());
	// if(r.equals(s))
			System.out.println("µÎ »ç°¢ÇüÀº °°½À´Ï´Ù.");
	}

}