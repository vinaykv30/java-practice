package stringadditionsubstring;

public class StringAdditionSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1="deepak";
        String s2=" java";
        System.out.println(s1+s2);
        System.out.println(s1+10);
        System.out.println(s1+10+20);
        System.out.println(10+s1+20);
        System.out.println(s1+20/10);
        System.out.println(s1+20*10);
        //System.out.println(s1+10-20);
        System.out.println(s1.concat(s2));
        System.out.println(String.join(";",s1,s2));
        System.out.println(String.join(s2,"/",s1,s2));
        System.out.println(String.join(";",s1,s2,s1));
        System.out.println(String.join("zzzz",s1,s2,s1));
	}

}