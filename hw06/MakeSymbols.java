/////////////////////////////////////////////////////////////////////////////
//lab 6
//Zev Koffsky
//2/27/15
//load scanner
import java.util.Scanner;
import java.util.Random;
// define class
public class MakeSymbols{
    //main method
    public static void main(String[] args){
        int x=(int)(Math.random()*100);
        System.out.println("random number: "+x);
        if (x%2==0 && x!=0){
            do{
                System.out.print("*");
                x=x-1;
            } while (x>0);
        }
        else if (x!=0){
            do{
               System.out.print("&");
               x=x-1;
            } while (x>0);
        }
        System.out.println();
    }
}