
public class ArrayTraverse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] a= {{10,20},{30,40,50}};
        for(int i=0;i<a.length;i++) {
        	for(int j=0;j<a[i].length;j++) {
        		System.out.print(a[i][j]+" ");
        	}
        	System.out.println();
        }
	}

}
