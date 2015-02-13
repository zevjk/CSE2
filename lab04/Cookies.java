/////////////////////////////////////////////////////////////////////////////
//Lab 2
//Zev Koffsky
//1/30/15
//load scanner
import java.util.Scanner;
//define class
public class Cookies{
    // main method required for every Java program
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        int people;
        int cookies;
        int share;
        System.out.print("Enter the number of people:");
            if (myScanner.hasNextInt() == true){
                people = myScanner.nextInt();
            }
            else{
            System.out.println("You did not input an integer");
                return;
            }
            if (people<=0){
                System.out.println("The number must be greater than zero");
            }
        System.out.print("Enter the number of cookies bought:");
            if (myScanner.hasNextInt() == true){
                cookies = myScanner.nextInt();
            }
            else{
            System.out.println("You did not input an integer");
                return;
            }
            if (cookies<=0){
                System.out.println("The number must be greater than zero");
            }
        System.out.print("How many cookies does each person get?:");
            if (myScanner.hasNextInt() == true){
                share = myScanner.nextInt();
            }
            else{
            System.out.println("You did not input an integer");
                return;
            }
            if (share<=0){
                System.out.println("The number must be greater than zero");
            }
            int x=people*share;
            if (x>cookies)
            {
                System.out.println("You do not have enough cookies, you need to buy "+(x-cookies)+" more cookies");
            }
            if (x<=cookies)
            {
                System.out.println("You have enough cookies for everyone");
            }
}  //end of main method   
      } //end of class
