package arrays;

public class LinearSearchString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String[] a= {"deepak","rohit","rahul","deepesh","amit"};
         String item="deepak";
         int temp=0;
         int i;
         for(i=0;i<a.length;i++)
         {
        	 if(a[i].equals(item))
        	 {
        		 System.out.println("item present in "+i+" index position");
        		 temp=temp+1;
        	 }
        	 if(temp==0)
        	 {
        		 
        		 System.out.println("item not present in the list");
        	 }
         }
	}

}
