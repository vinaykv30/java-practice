package shraddha;
import java.util.*;

public class ArmstrongNumber1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the no");
       int no=sc.nextInt();
       int t1=no;
       int length=0;
       while(t1!=0)
       {
       	length =length +1;
       	t1=t1/10;
       }
       int t2=no;
       int arm=0;
       while(t2!=0)
       {
       	int rem;
       	int mul=1;
       	rem=t2%10;
       	for(int i=1;i<=length;i++)
       	{
       		mul=mul*rem;
       	}
       	arm=arm+mul;
       	t2=t2/10;
       }
       if(arm==no)
       {
       	System.out.println(no+"is armstrong");
       	
       }
       else
       {
       	System.out.println(no+" is not armstrong");
       }
	}

	}


