package stringbufferdemo;

public class StringBufferDemo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StringBuffer sb1=new StringBuffer("deepak java");
        StringBuffer sb2=new StringBuffer("deepak java");
        System.out.println(sb1.equals(sb2)); /*StringBuffer class does not override equals method of Object class
       but String class override the equals method of Object class*/
        
	}

}
