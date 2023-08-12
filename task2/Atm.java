package task2;

import java.util.*;

public class Atm {
	
	@SuppressWarnings({ })
	
	public long acc_bal=0;
	public Atm(long acc_bal) //CONSTRUCTOR
	{
		this.acc_bal=acc_bal;
	}
	public void deposit(long dep)
	{
		this.acc_bal+=dep;
		System.out.println("Tansaction Successful...");
		System.out.println();
	}
	public void withdraw(long wd)
	{
		if(this.acc_bal<wd)
		{
			System.out.println("Insufficient Balance in your Account...");
			System.out.println("Your account balance is: Rs."+this.acc_bal);
			System.out.println();
		}
		else
		{
			System.out.println("Transaction Successful..");
			System.out.println("You have With drawn: Rs."+wd);
			System.out.println();
			this.acc_bal-=wd;
		}
	}
	public long checkbal()
	{
		return this.acc_bal;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atm[] atm=new Atm[1];
		atm[0]=new Atm(0);
		Scanner sc=new Scanner(System.in);
		int num;
		while(true)
		{
			System.out.println("Enter 1 to deposit money in your account...");
			System.out.println("Enter 2 to withdraw money from your account...");
			System.out.println("Enter 3 to check balance in your account...");
			System.out.println("Enter 4 to exit...");
			num=sc.nextInt();
			if(num==1)
			{
				long amount;
				System.out.println("Enter amount to deposit...");
				amount=sc.nextLong();
				atm[0].deposit(amount);
			}
			else if(num==2)
			{
				long amount;
				System.out.println("Enter amount in range 1 to 50000...");
				System.out.println("Enter amount to withdraw from your account...");
				amount=sc.nextLong();
				if(amount>50000 || amount<=0)
				{
					System.out.println("Transaction Failed...");
					System.out.println("Enter amount in range 1 to 50000...");
					System.out.println();
				}
				else
				{
					atm[0].withdraw(amount);
				}
			}
			else if(num==3)
			{
				System.out.println("Current balance in your account is: Rs."+atm[0].checkbal());
				System.out.println();
			}
			else if(num==4)
			{
				System.out.println("Thankyou...Visit Again..");
				break;
			}
			else
			{
				System.out.println("Invalid input...Please enter valid input...");
				System.out.println();
			}
		}
	}

}
