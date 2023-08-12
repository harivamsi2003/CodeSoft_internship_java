package task1;

import java.util.*;

public class Task1 {
	
	public static int score=0,rounds=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int min=1;
		int max=100,guess,sco=5;
		Random rand=new Random();
		int randnum=rand.nextInt(max-min+1)+1;//Generates random numbers in range 1 to 100
		int choices=5;
		System.out.println("You have "+choices+" choices...");
		System.out.println("Round "+rounds+":------>");
		System.out.println();
		while(choices!=0)
		{
			System.out.println("Enter a number to guess in range 1 to 100: ");
			guess=sc.nextInt();
			if(guess==randnum)
			{
				System.out.println("You Won!...");
				score+=sco;
				System.out.println("Your score is: "+score);
				break;
			}
			else if(Math.abs(guess-randnum)<3)
			{
				System.out.println("You are too close to number...");
			}
			else if(Math.abs(guess-randnum)>=3 && Math.abs(guess-randnum)<5)
			{
				System.out.println("You are close to number...");
			}
			else
			{
				System.out.println("You are far to number...");
			}
			choices--;
		}
		rounds++;
		System.out.println();
		System.out.println("You are out of choices...");
		if(score==0)
		{
			System.out.println("Try Again...Your Score: "+score);
		}
		System.out.println();
		int num;
		System.out.println("Enter 1 to PLAY AGAIN...");
		System.out.println("Enter 2 to EXIT...");
		num=sc.nextInt();
		if(num==1)
		{
			main(null);
		}
		else
		{
			System.out.println("Your score up to "+(rounds-1)+" rounds is: "+score);
			score=0;
		}
	}

}
