package student;
import java.util.Scanner;
class student
{
	int rollno;
	String name;
	student(int rno,String name)
	{
		this.rollno=rno;
		this.name=name;
	}
	void show()
	{
		System.out.println("rno is"+rollno+"and name is"+name);
	}
}
class test extends student
{
	int sub1,sub2,sub3;
	test(int sub1,int sub2,int sub3,int rollno,String name)
	{
		super(rollno,name);
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
	}
	void show_marks()
	{
		System.out.println("sub 1:"+sub1+"sub 2:"+sub2+"sub 3:"+sub3);
	
	}
}
interface sports
{
	int mark=40;
	void show_sport();
}
class result extends test implements sports
{
	int total=sub1+sub2+sub3+mark;
	public void show_sport()
	{
		System.out.println(+mark);
	}
	result(int rollno,String name,int sub1,int sub2,int sub3)
	{
		super(rollno,sub3,sub1,sub2,name);
	}
	void display()
	{
		super.show_marks();
		System.out.println(+total);
	}
}
public class total {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter rollno,name,marks");
		Scanner sc=new Scanner(System.in);
		int rollno=sc.nextInt();
		String name=sc.next();
		int sub1=sc.nextInt();
		int sub2=sc.nextInt();
		int sub3=sc.nextInt();
		result r=new result(rollno,name,sub1,sub2,sub3);
		r.display();
		r.show_sport();
		sc.close();
	}

}
