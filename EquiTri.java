package Delinmani;
import java.util.*;
public class EquiTri {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		double area=((Math.sqrt(3))/4)*(a*a);
		System.out.printf("Area of a Triangle is %.2f",area);
	}
}
