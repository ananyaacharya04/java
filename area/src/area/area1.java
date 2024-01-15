package area;
abstract class shape
{
	public int x,y;
	public abstract void printarea();
}
class rectangle extends shape
{
	public void printarea()
	{
		System.out.println("area of rectangle is"+x*y);
	}
}
class triangle extends shape
{
	public void printarea()
	{
		System.out.println("area of triangle is"+(x*y)/2);
	}
}
class circle extends shape
{
	public void printarea()
	{
		System.out.println("area of circle is"+(22*x*x)/7);
	}
}

public class area1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle r=new rectangle();
		r.x=10;
		r.y=20;
		r.printarea();
		triangle t=new triangle();
		t.x=10;
		t.y=20;
		t.printarea();
		circle c=new circle();
		c.x=10;
		c.y=20;
		c.printarea();
		
	}

}
