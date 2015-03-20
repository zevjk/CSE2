////////////////////////////////////////////////////////////////////////////
//HW 3
//Zev Koffsky
//2/10/15
//load scanner
import java.util.Scanner;
// define a class
public class Bicycle {
    			  // main method required for every Java program
   			  public static void main(String[] args) {
//Declare Scanner
Scanner myScanner;
myScanner = new Scanner(System.in);
//prompt for seconds
System.out.print(
"Enter the number of seconds:");
int Seconds = myScanner.nextInt();
//prompt for revolutions
System.out.print(
"Enter the number of counts:");
int Counts = myScanner.nextInt();

//calculations
double dist = (Counts*27*3.14/63360);
double time = (Seconds/60);
double speed = (dist/(time/60));

System.out.println("The distance was "+dist+" miles and took "+time+" minutes.");
System.out.println("The average speed in mph was "+speed);
         		  }  //end of main method   
  } //end of class