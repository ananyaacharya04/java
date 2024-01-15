package sort;

import java.util.Scanner;
public class sortarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a=new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array");
		
		for(int i=0;i<args.length;i++) { 
			 a[i]=Integer.parseInt(args[i]);
			 a[i]=sc.nextInt();
			 
		} 
		System.out.println("array before sorting");
		 for(int i=0;i<args.length;i++)
		{
			
			System.out.println(a[i]);
		}
		for(int i=0;i<args.length;i++)
		{
			for(int k=0;k<i+1;k++)
			{
				if(a[i]<a[k])
				{
				int temp;
				temp=a[i];
				a[i]=a[k];
				a[k]=temp;
				}
			}
		}
		System.out.println("array after sorting");
		for(int i=0;i<args.length;i++)
		{
			
			System.out.println(a[i]);
		}
		 sc.close();
	}

}
