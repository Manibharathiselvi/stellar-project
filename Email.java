package Delinmani;
import java.util.*;
public class Email {
public static void main(String[]args)
{
	Scanner s=new Scanner(System.in);
	String E=s.nextLine();
	System.out.println(E);
	if(E.contains("com")||E.contains("in")||E.contains("net")||E.contains("org"))
	{
		System.out.println("valid email");
			}
	else
	{
		System.out.println("Invalid email");
	}
}
}
