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
        //set up scanner
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        //initialize while loop for asking
        int i = 0;
        while (i<1){
            System.out.println("Please enter an integer between 9 and 16 inclusively");
            //check if input is integer to reask if not
            if (myScanner.hasNextInt()){
                int x = myScanner.nextInt();
                int e=x;
                int y=x;
                int a = x%1;
                //reask if not in range
                if (x>16||x<9||a!=0){
                    System.out.println("Invalid input, try again");
                }
                //count to not reask and calculate
                //for some reason, the numbers are wrong when 
                //input is above 13, but 12 and below is coorect
                else {
                    i=i+1;
                    while (x>1){
                        x=x-1;
                        e=e*x;
                    }
                System.out.println(y+"!="+e);
                }
            }
            else{
                System.out.println("Invalid input, try again");
                myScanner.next();
            }
        }
    }
}