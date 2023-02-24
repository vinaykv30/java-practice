package practicee;

public class BubbleSort {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
       int[] a= {10,20,12,17,5};
       int temp;
       {
    	   for(int i=0;i<=a.length;i++)
       
       for(int j=0;j<=a.length-1;j++)
       {
    	   if(a[j]>a[j+1])
    	   {
    		   temp=a[j];
    		   a[j]=a[j+1];
    		   temp=a[j+1];
    	   }
       }
       }
       
       for(int i=0;i<a.length;i++)
       {
    	   System.out.println(a[i]+" ");
       }
	}
}
	
