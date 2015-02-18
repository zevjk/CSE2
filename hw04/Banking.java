/////////////////////////////////////////////////////////////////////////////
//hw 4:2
//Zev Koffsky
//2/316/15
//load scanner
import java.util.Scanner;
import java.util.Random;
// define class
public class Banking{
    //main method
    public static void main(String[] args){
        Random r = new Random();
        int val = r.nextInt(4000)+1000;
        Scanner s = new Scanner(System.in);
        System.out.println("Do you want to deposit(1), withdraw(2), or view your balance(3)?");
        String str = s.next();
        if(str.equals("1")){
            System.out.println("How much would you like to deposit?");
            int dep = s.nextInt();
            if(dep<0){
                System.out.println("the number must be positive");
            }
            else{
                val=val+dep;
                System.out.println("Your balance is: " + val);
            }
        }
        else if(str.equals("2")){
            System.out.println("How much would you like to withdraw?");
            int withdraw = s.nextInt();
            if((withdraw<0) || (withdraw>val)){
                System.out.println("This number is invalid. Please try again");
            }
            else{
                val = val-withdraw;
            }
        }
        else if(str.equals("3")){
            System.out.println("Your current balance is :" + val);
        }
        else{
            System.out.println("That choice is not valid. please try again.");
        }
    }
}