/////////////////////////////////////////////////////////////////////////////
//lab 7
//Zev Koffsky
//3/6/15
//load scanner
import java.util.Scanner;
// define class
public class zigzag{
    //main method
    public static void main(String[] args){
        String answer = "d";
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        do {
            System.out.println("Enter an integer between 3 and 33 inclusively");
            if (myScanner.hasNextInt()){
                int nStars = myScanner.nextInt();
                if (nStars>=3 && nStars<=33 && nStars%1==0){
                    int x = 0;
                    for (int i=0; i<nStars; i++){
                    System.out.print("*");
                    }
                    System.out.println();
                    while (x<(nStars-2)){
                        for (int y=0; y<x; y++){
                            System.out.print(" ");
                        }
                        System.out.println(" *");
                        x=x+1;
                    }
                    for (int i=0; i<nStars; i++){
                        System.out.print("*");
                    }
                   System.out.println();
                }
                else{
                    System.out.println("Sorry, that is not within the range [3, 33]");
                }
                System.out.println("input y or Y to go again");
                answer = myScanner.next();
            }
            else{
                System.out.println("Sorry, that is not a valid input");
            }
        } while (answer.equals("y") || answer.equals("Y"));
    }
}