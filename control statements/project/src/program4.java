
import java.util.*;
 
public class Program4 {
    public static void main(String[] args) { 
        Scanner input = new Scanner (System.in);
        char ch;    
        int number;     
        int number1; 
        int number2; 
        int number3;         
        int number4; 
        int number5;    
        do {      
            System.out.print("Enter An Integeral Number Consisting of Five Digits : ");
            number = input.nextInt();
            number1 = number / 10000;
            number2 = ( number % 10000)/1000;
            number3 = ( number % 1000)/100;
            number4 = ( number % 100)/10;
             number5 = number % 10;
             if (number >= 10000 && number <= 99999)
                {
                System.out.println(number1 + "   " + number2 + "   " + number3 + "   " + number4 + "   " + number5);
                }    
    
            else
            {
                System.out.println("the  number contains more or less digits than 5");
            
            }
            
            System.out.print("Press Q to EXIT or any key to continue :");
            ch = input.next().charAt(0);
            if ((ch == 'Q') || (ch == 'q'))
            {
                break;
            }
        } while (true);
    }
