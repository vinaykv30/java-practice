package stringsearchingmethod;

public class StringSearching1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="deepak";
        System.out.println(s.indexOf("c"));//-1
        System.out.println(s.lastIndexOf("e"));//2
        System.out.println(s.charAt(3));//p
        System.out.println(s.contains("e"));//true
        System.out.println(s.startsWith("dep"));//false
        System.out.println(s.endsWith("ak"));//true
	}

}
