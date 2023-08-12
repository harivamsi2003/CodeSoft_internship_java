package task3;

import java.util.*;

public class Gradecalculator {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter no.of subjects: ");
		n=sc.nextInt();
		List<Integer> marks=new ArrayList<Integer>(n);
		for(int i=0;i<n;i++)
		{
			int mark;
			System.out.println("Enter marks of subject "+(i+1)+": ");
			mark=sc.nextInt();
			marks.add(mark);
		}
		int total=0;
		for(int i=0;i<n;i++)
		{
			total+=marks.get(i);
		}
		float percentage=((float)(total)/(n*100))*100;
		//System.out.println(percentage);
		if(percentage>90 && percentage<=100)
		{
			System.out.println("Your percentage: "+percentage+" Grade: A+");
		}
		else if(percentage>80)
		{
			System.out.println("Your percentage: "+percentage+" Grade: A");
		}
		else if(percentage>70)
		{
			System.out.println("Your percentage: "+percentage+" Grade: B");
		}
		else if(percentage>60)
		{
			System.out.println("Your percentage: "+percentage+" Grade: C");
		}
		else if(percentage>50)
		{
			System.out.println("Your percentage: "+percentage+" Grade: D");
		}
		else if(percentage>=40)
		{
			System.out.println("Your percentage: "+percentage+" Grade: P");
		}
		else
		{
			System.out.println("Your percentage: "+percentage+" Grade: F");
		}
	}

}
