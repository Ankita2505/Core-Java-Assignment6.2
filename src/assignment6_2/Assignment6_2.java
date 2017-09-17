package assignment6_2;
/*
 * program to generate a user-defined exception called NegativeAgeException if the user inputs negative value for age.
 */
import java.util.Scanner; //importing Scanner Class

class NegativeAgeException extends Exception
{
	public NegativeAgeException(String str)
	{
		System.out.println(str);
	}
}
public class Assignment6_2 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);// Creating Object of Scanner Class
        int age;
        System.out.println("Enter age:");
        age=s.nextInt(); // User Input for Age
        s.close();
        try
        {
        	if(age<0)throw new NegativeAgeException("Invalid Age");
        	else
        		System.out.println("Valid Age");
        }
        catch(NegativeAgeException a)
        {
        	System.out.println(a);
        }
	}
}
