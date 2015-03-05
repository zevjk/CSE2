/////////////////////////////////////////////////////////////////////////////
//hw 6
//Zev Koffsky
//3/3/15
//load scanner
import java.util.Scanner;
// define class
public class RunFactorial{
    //main method
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        System.out.println("Please enter an integer between 9 and 16 inclusively");
        if (myScanner.hasNextInt()){
            int x = myScanner.nextInt();
            int a = x%1;
            if (x>16||x<9||a!=0){
                System.out.println("Invalid input, try again");
            }
        }
        else{
            System.out.println("Invalid input, try again");
            myScanner.next();
        }
    }
}