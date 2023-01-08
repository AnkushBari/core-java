package basicprogram;

import java.util.Arrays;

public class Stringop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		String s1 = new String("Hello");
		String s2 ="ganesh";
		String s = "  HELLO   .s";
		String s3 ="My name is";
		System.out.println(s1+" "+s2);
		System.out.println(s3.concat(s2));
		System.out.println("Length:"+s3.length());
		System.out.println("Substring:" +s3.substring(3,7));
		System.out.println("Upper case:"+s2.toUpperCase());
        String s4 ="";
        System.out.println("To check a null:" +s3.isBlank());
        char[] arr = new char[10];
        s3.getChars(0,10,arr,0);
        System.out.println("Getchars:"+Arrays.toString(arr));
        System.out.println("Compoarison:" +s.compareTo(s1));
        System.out.println("Compoarison1:" +s1.compareTo(s));
        System.out.println("Equals:" +s1.equals(s));
        System.out.println("Equals:" +s1.equalsIgnoreCase(s));
        System.out.println("Starwith :" +s1.startsWith("He"));
        System.out.println("Endswith :" +s1.endsWith("p"));
        System.out.println("Replace :"+s2.replace("ganesh","ankush" ));
        System.out.println("Repeat:" +s.repeat(6));
        System.out.println("charAt:" +s3.charAt(0));
        System.out.println("Trim Lead :" + s.stripLeading());
        System.out.println("Trim Trail :" + s.stripTrailing());
	}

}
