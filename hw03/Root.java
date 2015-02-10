////////////////////////////////////////////////////////////////////////////
//HW 3 root
//Zev Koffsky
//2/10/15
//load scanner
import java.util.Scanner;
// define a class
public class Root {
    			  // main method required for every Java program
   			  public static void main(String[] args) {
//Declare Scanner
Scanner myScanner;
myScanner = new Scanner(System.in);
//prompt for double
System.out.print(
"Enter a double to see its cube root:");
double cube = myScanner.nextDouble();
double x = cube/3;
double y = (2*x*x*x+cube)/(3*x*x);
double z = (2*y*y*y+cube)/(3*y*y);
double a = (2*z*z*z+cube)/(3*z*z);
double b = (2*a*a*a+cube)/(3*a*a);
double root = (2*b*b*b+cube)/(3*b*b);
System.out.println("The cube root of "+cube+" is "+root);
System.out.println(root+"*"+root+"*"+root+"="+cube);
         		  }  //end of main method   
  } //end of class