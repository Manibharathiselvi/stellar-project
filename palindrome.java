package Delinmani;
import java.util.*;
public class palindrome {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		StringBuffer str1=new StringBuffer(str).reverse();
		if(str.equals(str1.toString()))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");

		}
		
	}
}
