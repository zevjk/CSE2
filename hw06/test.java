/////////////////////////////////////////////////////////////////////////////
//Zev Koffsky
//load scanner
import java.util.Scanner;
// define class
public class test{
    //main method
    public static void main(String[] args){
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        while (myScanner.hasNext()){
            if (myScanner.hasNextInt()){
                System.out.println(myScanner.next());
            }
            else{
                System.out.println("That input is invalid");
            }
        }
        System.out.println(b);
    }
}