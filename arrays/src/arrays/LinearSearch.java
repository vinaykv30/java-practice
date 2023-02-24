package arrays;

public class LinearSearch {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        int[] a= {5,3,6,1,4,2};
        int item= 9;
        int temp=0;
        for(int i=0;i<a.length;i++)
        {
        	if(a[i]==item)
        	{
        		System.out.println("item is present at"+" index position");
        		temp = temp+1;
        		
        	}
        	if(temp==0)
        	{
        		System.out.println("item not found in the list");
        	}
        }
        
	}

}
