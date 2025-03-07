package Delinmani;
import java.util.*;
public class speed {
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	float a=sc.nextFloat();
	float b=sc.nextFloat();
	float c=b-a;
	float d=c*25;
	System.out.printf("The distance travelled is %.2f \n",c);
	System.out.println("The speed is " +Math.round(d));
}
}