package arrays;

public class SecondLargest1Sorting {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] a= {6,8,2,4,3,1,5,7};
	       int temp;
	       for(int i=0;i<a.length;i++)
	       {
	    	   for(int j=i+1;j<a.length;j++)
	    	   {
	    		   if(a[i]<a[j])
	    		   {
	    			   temp = a[i];
	    			   a[i] = a[j];
	    			   a[j] = temp;
	    		   }
	    		   if(i==1)
	    		   {
	    			   break;
	    		   }
	    	   }
	    	   for(int k=0;k<a.length;k++)
	    	   {
	    		   System.out.print(a[i]+" ");
	       }
	       
	       System.out.println("Second largest element is"+a[1]);
		}
	}

}
