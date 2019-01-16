
import java.util.Scanner;
public class program2
{
    public static void main(String[] args) 
    {
        int number;  
        char ch;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter your number : ");
            number = input.nextInt();
            if (number == 1)
                System.out.println("January");
            else if (number == 2)
                System.out.println("February");
            else if (number == 3)
                System.out.println("March");
            else if (number == 4)
                System.out.println("April");
            else if (number == 5)
                System.out.println("May");
            else if (number == 6)
                System.out.println("June");
            else if (number == 7)
                System.out.println("July");
            else if (number == 8)
                System.out.println("August");
            else if (number == 9)
                System.out.println("September");
            else if (number == 10)
                System.out.println("October");
            else if (number == 11)
                System.out.println("November");
            else if (number == 12)
                System.out.println("December");
            else if (number 12 || number <12)
                System.out.println("pleae enter a number between 1-12.");
            System.out.print("Press Y to continue:");
            ch = input.next().charAt(0);
            } while (ch == 'Y' || ch == 'y');         
    }
