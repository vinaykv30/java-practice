package shraddha;
import java.util.*;


public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int no;
        System.out.println("Enter the number");
       Scanner sc=new Scanner(System.in);
         no=sc.nextInt();
       // sc.close();
        
        int temp=0;
        for(int i=2;i<=no-1;i++)
        { 
        	if(no%i==0) 
        	{
        		temp=temp+1; 
        	}
        }
        if(temp==0)
        { 
        	System.out.println(no+"is prime no");
        }
        else {
        	System.out.println(no+"is not prime");
        }
	}

}
