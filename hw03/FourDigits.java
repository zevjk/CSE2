////////////////////////////////////////////////////////////////////////////
//HW 3 root
//Zev Koffsky
//2/10/15
//load scanner
import java.util.Scanner;
// define a class
public class FourDigits {
    			  // main method required for every Java program
   			  public static void main(String[] args) {
//Declare Scanner
Scanner myScanner;
myScanner = new Scanner(System.in);
System.out.print(
"Input a number, I will display the first four digits to the rigth of the decimal place: ");
double num = myScanner.nextDouble();
double y = (10000)*(num % 1);
int x = (int)y;
System.out.println("The four digits are "+x);
         		  }  //end of main method   
  } //end of class