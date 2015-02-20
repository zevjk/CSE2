/////////////////////////////////////////////////////////////////////////////
//lab 5
//Zev Koffsky
//2/20/15
//load scanner
import java.util.Scanner;
import java.util.Random;
// define class
public class SpaceExploration{
    //main method
    public static void main(String[] args){
        int rand = (int)(Math.random()*10+2000);
        System.out.println("Here is a timeline of space exploration events from "+rand+" to 2000:");
        switch (rand){
            case 2010:
                System.out.println("2010:SpaceX sucessfully sends spacecraft to orbit and back");
            case 2009:
            case 2008:
                System.out.println("2008:Kepler launched to study deep space");
            case 2007:
            case 2006:
                System.out.println("2006:Spacecraft returns with collections from a comet");
            case 2005:
                System.out.println("2005:Spacecraft collides with comet");
            case 2004:
            case 2003:
                System.out.println("2003:Largest infrared telescope released");
            case 2002:
            case 2001:
                System.out.println("2001:First spacecraft lands on asteroid");
            case 2000:
                System.out.println("2000:First spacecraft orbits an asteroid");
                break;
        }
    }
}