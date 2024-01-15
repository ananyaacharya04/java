package bankacc;

import java.util.Scanner;
import bankacc.bankaccount;

public class bank extends bankacc.bankaccount
	{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bankaccount b=new bankaccount();
		Scanner sc=new Scanner(System.in);
		System.out.print("enter acno,name,type,bal");
		bankaccount ba=new bankaccount(sc.nextInt(),sc.next(),sc.next(),sc.nextInt());
		System.out.print("enter amount to deposit");
		ba.deposit(sc.nextInt());
		System.out.print("enter amount to withdraw");
		ba.withdraw(sc.nextInt());
		ba.display();
		sc.close();
	}

}
