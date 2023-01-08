package basicprogram;

public class Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=5; i>=1; i--) {
			System.out.println(i);
		}
		
		int i =1;
		while(i<=5)
		{System.out.println(i);
		i++;
		
		int j=1;
		do {
			System.out.println(j);
			j++;
			}while(j<=5);
		}
		
		int sum = 0 , rem;
		int num = 24;
		while (num != 0) {
			rem = num % 10;
			sum +=rem;
			num = num /10;			
		System.out.println(sum);*/
		
		int rev =0 ,rem;
		int num = 22;
		while (num!=  0) {
			rem = num % 10;
			rev +=rem * 10 +rem;
			num = num /10;	
			}
		System.out.println(rev);
		
			}

}



