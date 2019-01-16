import java.util.*;
import java.lang.Math;
public class Program5 {
    public static void main (String[] args) { 
        Scanner input = new Scanner (System.in);
        int i; 			
        int n;			
        int factorial = 1;
        double x;		
        double sum = 1;	  
        System.out.println("EQUATION :: 1 + x + x^2/2! + x^3/3! + ... + x^n/n! ");
        System.out.print("Enter value of x :");
        x = input.nextDouble();
        System.out.print("Enter number of terms,n :");
        n = input.nextInt();
        for (i=1; i<=n; ++i){
            factorial *= i;
			sum += Math.pow(x,i) / factorial;
        }
        System.out.println("Sum of the EQUATION = " + sum);
