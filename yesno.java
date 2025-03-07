package Delinmani;
import java.util.*;
public class yesno {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char x=str.charAt(0);
		char y=str.charAt(1);
		int flag=0;
		if(x==y)
		{
			flag=1;
		}
		else
		{
			for(int i=2;i<str.length();i++)
			{
				if(i%2==0)
				{
					if(x==str.charAt(i))
					{
						flag=1;
						break;
					}
					else if(y==str.charAt(i))
					{
						flag=1;
						break;
					}
				}
				if(flag==1)
				{
					System.out.println("No");
				}
				else
				{
					System.out.println("Yes");
				}
			}
		}
	}
}

