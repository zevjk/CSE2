import java.util.Scanner;
public class WhichNumber{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Is your number even?");
        String truths = s.next();
        if(truths.equals("Y")||truths.equals("y")){
            System.out.println("Is divisible by 3?");
            truths=s.next();
            if(truths.equals("Y")||truths.equals("y")){
                System.out.println("When devided by 3, is your number greater than 1?");
                truths=s.next();
                if(truths.equals("Y")||truths.equals("y")){
                    System.out.println("Your number is 9!");
                }
                else{
                    System.out.println("Your number is 3!");
                }
            }
            else{
                System.out.println("Is your number greater than 6?");
                truths=s.next();
                if(truths.equals("Y")||truths.equals("y")){
                    System.out.println("Your number is 7!");
                }
                else{
                    System.out.println("Is your number less than 3?");
                    truths=s.next();
                    if(truths.equals("Y")||truths.equals("y")){
                        System.out.println("Your number is 1!");
                    }
                    else{
                        System.out.println("Your number is 5!");
                    }
                }
            }
        }
        else{
            System.out.println("Is divisible by 3?");
            truths=s.next();
            if(truths.equals("Y")||truths.equals("y")){
                System.out.println("Your number is 6!");
            }
            else{
                System.out.println("Is your number divisible by 4?");
                truths=s.next();
                if(truths.equals("Y")||truths.equals("y")){
                    System.out.println("Is your number devided by 4 greater than 1?");
                    truths=s.next();
                    if(truths.equals("Y")||truths.equals("y")){
                        System.out.println("Your number is 8!");
                    }
                    else{
                        System.out.println("Your number is 4!");
                    }
                }
                else{
                    System.out.println("Is your divisible by 5?");
                    truths=s.next();
                    if(truths.equals("Y")||truths.equals("y")){
                        System.out.println("Your number is 10!");
                    }
                    else{
                        System.out.println("Your number is 2!");
                    }
                }
            }
        }
    }
}