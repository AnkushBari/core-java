package basicprogram;

public class Bitwiseop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int x,y;
     
     x = 0;
     y = 0;
  	System.out.println("x & y : 0 & 0 : " + (x & y)); 		
  	System.out.println("x | y : 0 | 0 : " + (x | y)); 		
  	System.out.println("x ^ y : 0 ^ 0 : " + (x ^ y));  		
  	
  	x = 0; 		
  	y = 1; 		
  	System.out.println("x & y : 0 & 1 : " + (x & y)); 		
  	System.out.println("x | y : 0 | 1 : " + (x | y)); 		
  	System.out.println("x ^ y : 0 ^ 1 : " + (x ^ y));  		
  	
  	x = 1; 		
  	y = 0; 		
  	System.out.println("x & y : 1 & 0 : " + (x & y)); 		
  	System.out.println("x | y : 1 | 0 : " + (x | y)); 		
  	System.out.println("x ^ y : 1 ^ 0 : " + (x ^ y));  		
  	
  	x = 1; 		
  	y = 1; 		
  	System.out.println("x & y : 1 & 1 : " + (x & y)); 		
  	System.out.println("x | y : 1 | 1 : " + (x | y)); 		
  	System.out.println("x ^ y : 1 ^ 1 : " + (x ^ y));
     
	}

}
