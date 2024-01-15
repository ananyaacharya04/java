package quadratic;
import java.util.Scanner;
public class roots {

	public static void main(String[] args) {
		double r1,r2;
		// TODO Auto-generated method stub
		System.out.println("enter cosffts of eqn");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=b*b-4*a*c;
		if(d<0)
		{
			System.out.println("no roots");
		}
		if(d==0)
		{
			System.out.println("roots are real and equal");
			r1=r2=-b/2*a;
			System.out.println("roots are r1="+r1+"r2="+r2);
		}
		if (d>0)
		{
			System.out.println("roots are real");
			r1=(-b+Math.sqrt(d))/2*a;
			r2=(-b-Math.sqrt(d))/2*a;
			System.out.println("roots are r1="+r1+"r2="+r2);
		}
		sc.close();
		}

}
