
public class ArrayTraverse3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][][] a= {{{10,20},{30,40,50}},{{60,70,80},{90,100}}};
        for(int i=0;i<a.length;i++) {
        	for(int j=0;j<a[i].length;j++)
        	{
        		for(int k=0;k<a[i][j].length;k++) {
        			System.out.print(a[i][j][k]+" ");
        		}
        		System.out.println();
        	}
        }
	}

}
