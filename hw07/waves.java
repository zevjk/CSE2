/////////////////////////////////////////////////////////////////////////////
//lab 7
//Zev Koffsky
//3/19/15
//load scanner
import java.util.Scanner;
// define class
public class waves{
    //main method
    public static void main(String[] args){
        int x;
        int count1;
        int count2;
        int count3=1;
        Scanner myScanner;
        myScanner = new Scanner( System.in );
        System.out.println("Enter an integer between 1 and 30");
        if (myScanner.hasNextInt()){
            x = myScanner.nextInt();
            if (x<1 || x>30){
                System.out.println("Not a valid input");
                return;
            }
            else{
                System.out.println();
                
                // starting the for loop
                System.out.println("For Loop:");
                for (count1=1;count1<=x;count1++){
                    if (count1%2==0){
                        for (count2=1;count2<=count1;count2++){
                            for (count3=1;count3<=count2;count3++){
                                System.out.print(count1);
                            }
                        }
                    }
                    else{
                        for (count2=1;count2<x;count2--){
                            for (count3=1;count3<x;count3--){
                            }
                            //wont show up, not sure why
                            //need help with this code, it just isn't cooperating
                        }
                    }
                }
                
                //start while loop
                System.out.println("While Loop:");
                count1=1;
                while(count1<=x){
                    if(count1%2==0){
                        count2=1;
                        while(count2<=count1){
                            System.out.println(count1);
                            count3++;
                        }
                        System.out.println();
                        count2++;
                    }
                    else{
                        count2=count1;
                        while (count2>=1){
                            count3=1;
                            while(count3>=count2){
                                System.out.println(count1);
                                count3=count3+1;
                            }
                            System.out.println();
                            count2--;
                        }
                    }
                    count1++;
                }
                System.out.println();
                
                //start do while loop
                System.out.println("Do while loop");
                count1=1;
                do{
                    if (count1%2==0){
                        count2=1;
                        do{
                            count3=1;
                            do{
                                System.out.print(count1);
                                count3++;
                            }while (count3<=count2);
                            System.out.println();
                            count2++;
                        }while (count2<=count1);
                    }
                    else{
                        count2=count1;
                        do{
                            count3=1;
                            do{
                                System.out.print(count1);
                                count3++;
                            }while(count3<=count2);
                            System.out.println();
                            count2--;
                        }while(count2>=1);
                    }
                    count1++;
                }while(count1<=x);
            }
        }
        else{
            System.out.println("That is an invallid input");
        }
    }
}