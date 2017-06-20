import java.util.Scanner;

public class Homework211 {

	public static void main(String[] args) {
	 
		int n = 0;
		int sum = 0;
		Scanner s = new Scanner(System.in);
	    String l = s.nextLine();
	    char a = l.charAt(n);
	    char b = ' ';
	    
	    while( a != '.')
	    {
	    	if( a != ' ' )
	    	{
	    		sum = sum + 1;
	    	} else if ( a == ' ' )
	    	{
	    	    if ( b != ' ' )
	    	    {	
	    	    	System.out.print(sum);
	    		    System.out.print(" ");
	    	    }
	    		sum = 0;
	    	}
	    	b = l.charAt(n);
	    	n ++;
	    	a = l.charAt(n);
	    }
	    System.out.print(sum);
	    	
	}
}