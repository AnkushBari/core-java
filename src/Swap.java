package basicprogram;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n1 = 2;
        int n2 = 3;
        n1 = n1+n2;
       /* System.out.println(n1);
        System.out.println(n2);
        n2 = n1-n2;
        n1 = n1*n2;
        System.out.println(n1);
        System.out.println(n2);
        */
		
		int temp;
		temp= n2;
		n2 = n1;
		n1 = temp;
		System.out.println(n1);
        System.out.println(n2);
        
	}

}
