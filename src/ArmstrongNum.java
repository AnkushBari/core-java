package basicprogram;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,arm=0,rem,c;
		System.out.println("Enter any number");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		c=n;
		
		while(n>0);
		{
			rem=n%10;
			arm=(rem*rem*rem)+arm;
			n=n/10;
			
		}
        if(c==arm)
        	System.out.print("Armstrong Number ");
        else
        	System.out.print("Not Armstrong Number");
	}

}
