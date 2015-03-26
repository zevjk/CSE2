/////////////////////////////////////////////////////////////////////////////
//hw 8
//Zev Koffsky
//3/23/15
//load scanner
import java.util.Scanner;
import java.util.Random;
// define class
public class HW8{
    //main method
    public static void main(String[] args){
        //set up scanner
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
    }
 public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }

    public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    
    public static void box(){
       System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }
    
    //Cc string
    public static String getInput(Scanner scan, String string){
        String input=scan.next();
        if (input.equals("c")|| input.equals("C")){
            return "";
        }
        else{
            System.out.println("Yea right LOSER");
            System.exit(0);
        }
        return "";
    }
    
    //complicated method
    public static String getInput(Scanner scan, String string, int trial){
        int z=0;
        while (z<10){
            String input=scan.next();
            if (input.equals("a")|| input.equals("A")){
                int x=(int)(Math.random()*101);
                if (x>50){
                    z++;
                    System.out.println("Crit # "+z);
                }
                else{
                    System.out.println("Miss!");
                    continue;
                }
                if (z==10){
                    System.out.println("Killed the giant!");
                    return "";
                }
            }
            else if (input.equals("e")|| input.equals("E")){
                int y=(int)(Math.random()*10+1);
                    if (y==10){
                        System.out.println("Succesfully escaped from the giant!");
                        break;
                    }
                    else{
                        System.out.println("Escape failed. Attack or attempt escape again?");
                        continue;
                    }
            }
            else{
                System.out.println("Executed by the Giant! GAME OVER!");
                System.exit(0);
            }
        }
        return"";
    }
    
    //scan method
    public static String getInput(Scanner scan){
        String reward;
        int a = 1;
        //something to go back to
        do {
            //make sure it's an int
            if (scan.hasNextInt()){
              int s = scan.nextInt();
              //determine the reward
                switch (s){
                   case 1: reward = "You opened the chest and it was filled with snakes!  Tough break.";
                        a++;
                        break;
                    case 2: reward = "You opened the chest and it was filled with cold bullion! Wow, talk about lucky!";
                        a++;
                        break;
                    case 3: reward = "You opened the chest and it was empty...At least it wasn't snakes.";
                        a++;
                        break;
                    default:reward = "A Wrong Number! You get nothing! Better restart the game LOL";
                        a++;
                        break;
                }
                System.out.println(reward);
            }
            //want it to ask again, but it's only repeating itself.  I don't know
            //how to make the program ask for the value of s again
            else{
                System.out.println("Not a number, pick again, and this time, 1, 2, or 3");
                
            }
        } while (a==1);
        return"";
    }
}