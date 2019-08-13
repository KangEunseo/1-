//원의 둘레와 면적
abstract class ShapeExam{
	final double PI=3.14;
	public abstract double getArea();
	public abstract double getCircum();
}

class child_shape extends ShapeExam{
	public double getArea(){
		return PI*5*5;
	}
	public double getCircum(){
		return PI*10;
	}
}

class abs_Test3{
	public static void main(String ar[]){
		child_shape c=new child_shape();
		System.out.println(c.getArea());
		System.out.println(c.getCircum());
	}
}