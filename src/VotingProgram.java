package basicprogram;

public class VotingProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =25;
		int b =1;
		int c =20;
		
		if(b >=18) {
			System.out.println(" You can  vote ");
		} else {
			System.out.println("No");
		}
		if (a > b && b < c) {
			System.out.println("max is a");
		}else if (b > a && b > c) {
			System.out.println(b);
		}else {
			System.out.println(c);
		}
			
			
		}
	
	}


