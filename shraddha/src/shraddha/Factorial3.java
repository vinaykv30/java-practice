package shraddha;
import java.util.*;

public class Factorial3 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no");
        int no=sc.nextInt();
        int fact=1;
        for(int i=1;i<=no;i++)
        {
        	fact=fact*i;
        }
        System.out.println("factorial of "+no+"is "+fact);
        
	}

}
