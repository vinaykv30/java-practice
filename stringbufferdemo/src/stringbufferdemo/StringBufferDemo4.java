package stringbufferdemo;

public class StringBufferDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());    //16
        
        sb.append("hello");
        System.out.println(sb.capacity());     //16
        
        sb.append("deepak javaa");
        System.out.println(sb.capacity());       //(old capacity*2)+2 or (old capacity+1)*2
                                                 //(34*2)+2=70
        
        
	}

}
