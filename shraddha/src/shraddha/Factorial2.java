package shraddha;

public class Factorial2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int no=5;
        int fact=1;
        for(int i=no;i>=1;i--)
        {
        	fact=fact*i;
        }
             System.out.println("factorial of "+no+"is"+fact);
	}

}
