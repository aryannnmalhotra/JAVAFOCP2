
import java.util.*;
public class program3 {    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a  decimal number: ");
        double x = input.nextDouble(); 
        System.out.print("enter a decimal number: ");
        double y = input.nextDouble();
        a = Math.round(a * 1000); 
        a = a / 1000;             
        b = Math.round(b * 1000);
        b = b / 1000;
        if (a == b)
        {
            System.out.println(" the number is same up to three decimal places");
        }
        else
        {
            System.out.println("the number is different");
        }
    }
=======
import java.util.Scanner;
public class program3 {    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a  decimal number: ");
        double x = input.nextDouble(); 
        System.out.print("enter a decimal number: ");
        double y = input.nextDouble();
        a = Math.round(a * 1000); 
        a = a / 1000;             
        b = Math.round(b * 1000);
        b = b / 1000;
        if (a == b)
        {
            System.out.println(" the number is same up to three decimal places");
        }
        else
        {
            System.out.println("the number is different");
        }
    }

}