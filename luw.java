package Delinmani;
import java.util.*;
public class luw {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		int c=s.nextInt();
		int d=c%10;
		if(d==3||d==8)
		{
			System.out.println("Lucky Winner");
		}
		else
		{
			System.out.println("...");
		}
	}

}
