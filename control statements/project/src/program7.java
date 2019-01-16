
import java.util.*;
public class program7
{
    public static void main(String[] args) {
	    int rows;	
	    int a, b, c;		
	    int number;		
	    char ch; 	
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("Enter the Number of Rows : ");
			rows = input.nextInt();
			for(i=0; a<rows; a++)
			{
				for(b=rows; b>a; b--)
				{
					System.out.print(" ");
				}
	            number = 1;
				for(c=0; c<=a; c++)
				{
					 System.out.print(number + " ");
	                 number = number * (a-c) / (c+1);
				}
				System.out.println();
			}
			System.out.print("Press Q to EXIT else any key to continue :");
	        ch = input.next().charAt(0);
	        if ((ch == 'Q') || (ch == 'q'))
	        {
	        	break;
	        }
        } while (true);
	}
