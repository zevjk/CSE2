/////////////////////////////////////////////////////////////////////////////
//hw 4:1
//Zev Koffsky
//2/316/15
//load scanner
import java.util.Scanner;
// define class
public class WhichNumber{
    //main method
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        //start questions
        System.out.println("Is your number even?");
        String truths = s.next();
        if(truths.equals("Y")||truths.equals("y")){
            System.out.println("Is divisible by 3?");
            truths=s.next();
            if(truths.equals("Y")||truths.equals("y")){
                System.out.println("When devided by 3, is your number greater than 1?");
                truths=s.next();
                if(truths.equals("Y")||truths.equals("y")){
                    //conclusions
                    System.out.println("is your number 9?");
                    truths=s.next();
                    if(truths.equals("Y")||truths.equals("y")){
                        System.out.println("Yay!");
                    }
                    if(truths.equals("n")||truths.equals("N")){
                        System.out.println("That is not consistent");
                    }
                }
                if(truths.equals("n")||truths.equals("N")){
                    System.out.println("is your number 3?");
                    truths=s.next();
                    if(truths.equals("Y")||truths.equals("y")){
                        System.out.println("Yay!");
                    }
                    if(truths.equals("n")||truths.equals("N")){
                        System.out.println("That is not consistent");
                    }
                }
            }
            if(truths.equals("n")||truths.equals("N")){
                System.out.println("Is your number greater than 6?");
                truths=s.next();
                if(truths.equals("Y")||truths.equals("y")){
                    System.out.println("Is your number 7?");
                    truths=s.next();
                    if(truths.equals("Y")||truths.equals("y")){
                        System.out.println("Yay!");
                    }
                    if(truths.equals("n")||truths.equals("N")){
                        System.out.println("That is not consistent");
                    }
                }
                if(truths.equals("n")||truths.equals("N")){
                    System.out.println("Is your number less than 3?");
                    truths=s.next();
                    if(truths.equals("Y")||truths.equals("y")){
                        System.out.println("is your number 1?");
                        truths=s.next();
                        if(truths.equals("Y")||truths.equals("y")){
                            System.out.println("Yay!");
                        }
                        if(truths.equals("n")||truths.equals("N")){
                            System.out.println("That is not consistent");
                        }
                    }
                    if(truths.equals("n")||truths.equals("N")){
                            System.out.println("Is your number 5?");
                        truths=s.next();
                        if(truths.equals("Y")||truths.equals("y")){
                            System.out.println("Yay!");
                        }
                        if(truths.equals("n")||truths.equals("N")){
                            System.out.println("That is not consistent");
                        }
                    }
                }
            }
        }
        if(truths.equals("n")||truths.equals("N")){
            System.out.println("Is divisible by 3?");
            truths=s.next();
            if(truths.equals("Y")||truths.equals("y")){
                System.out.println("Your number is 6!");
            }
            if(truths.equals("n")||truths.equals("N")){
                System.out.println("Is your number divisible by 4?");
                truths=s.next();
                if(truths.equals("Y")||truths.equals("y")){
                    System.out.println("Is your number devided by 4 greater than 1?");
                    truths=s.next();
                    if(truths.equals("Y")||truths.equals("y")){
                        System.out.println("Is your number 8?");
                                            truths=s.next();
                    if(truths.equals("Y")||truths.equals("y")){
                        System.out.println("Yay!");
                    }
                    if(truths.equals("n")||truths.equals("N")){
                        System.out.println("That is not consistent");
                    }
                    }
                    if(truths.equals("n")||truths.equals("N")){
                        System.out.println("Is your number 4?");
                                            truths=s.next();
                    if(truths.equals("Y")||truths.equals("y")){
                        System.out.println("Yay!");
                    }
                    if(truths.equals("n")||truths.equals("N")){
                        System.out.println("That is not consistent");
                    }
                    }
                }
                if(truths.equals("n")||truths.equals("N")){
                    System.out.println("Is your divisible by 5?");
                    truths=s.next();
                    if(truths.equals("Y")||truths.equals("y")){
                        System.out.println("is your number 10?");
                                            truths=s.next();
                    if(truths.equals("Y")||truths.equals("y")){
                        System.out.println("Yay!");
                    }
                    if(truths.equals("n")||truths.equals("N")){
                        System.out.println("That is not consistent");
                    }
                    }
                    if(truths.equals("n")||truths.equals("N")){
                        System.out.println("Is your number 2?");
                                            truths=s.next();
                    if(truths.equals("Y")||truths.equals("y")){
                        System.out.println("Yay!");
                    }
                    if(truths.equals("n")||truths.equals("N")){
                        System.out.println("That is not consistent");
                    }
                    }
                }
            }
        }
    }
}