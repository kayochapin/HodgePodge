
/**
 * Write a description of class Summation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class Summation
{
    public static void main(String[] args)
    {
        // Clear the BlueJ terminal
        System.out.println('\u000C');
        
        // Instantiate the input from the user.
        Scanner inputScanner = new Scanner(System.in);
        
        // Variable declarations
        int n;
        int answer = 0;
        
        // Prompt user and input an integer.
        System.out.print("For a sum, enter an integer:  ");
        n = inputScanner.nextInt();
        
        // Calculate the summation of the integers up to the inputted number.
        for (int i = 1; i <= n; i++)
        {
            answer += i;  // answer = answer + i
        }
        
        // Output the answer.
        System.out.println("The summation of the integer " + n + " is " + answer + ".");
    }
}
