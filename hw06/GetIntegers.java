/////////////////////////////////////////////////////////////////////////////
//hw 6
//Zev Koffsky
//3/3/15
//load scanner
import java.util.Scanner;
// define class
public class GetIntegers{
    //main method
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        int y=0;
        System.out.println("Please input five positive integers");
        for (int i=0; i<5; i=i){
            if (myScanner.hasNextInt()){
                int x = myScanner.nextInt();
                if (x>=0){
                    y=y+x;
                    i++;
                }
                else{
                    System.out.println("Invalid input, ignored. Input another value");
                }
            }
            else{
                System.out.println("Invalid input, ignored. Input another value");
                myScanner.next();
            }
        }
        System.out.println("Sum is "+y);
    }
}