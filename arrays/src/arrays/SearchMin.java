package arrays;

public class SearchMin {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        int[] a= {4,3,5,2,8,1,6};
        int min =a[0];
        for(int i=1;i<a.length;i++)
        {
        	if(min>a[i])
        	{
        		min=a[i];
        	}
        }
        System.out.println("minimum element is"+min);
	}

}
