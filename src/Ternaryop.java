package basicprogram;

public class Ternaryop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int  a =5;
	    String result=a%2==0? "even":"odd";
		System.out.println(result);
		
		int age=25;
		String Message = (age>=18?" You are eligible to Vote" : "You are Not eligible to Vote");
		System.out.println(Message);*/
		
		
		/*int a=6;
		String result=a%2==0 ?
		"even": "odd";
		System.out.println(result);*/
		
		
		int a=33;
		int b=40;
		int c=30;
		System.out.println((a > b)? "A is Greater ": " B  is Greater");
		int result = (a>b)? ((a>c)? a:c): (b>c ? b:c);
		System.out.println(result);
		
		
			
	}

}
 