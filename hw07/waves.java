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
        int ct1;
        int ct2;
        int ct3=1;
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
                System.out.println("For Loop:");
                for (ct1=1;ct1<=x;ct1++){
                    if (ct1%2==0){
                        for (ct2=1;ct2<=x;ct2++){
                            for (ct3=1;ct3<=x;ct3++){
                                System.out.print(ct1);
                            }
                        }    
                    }
                    else{
                        for (ct2=1;ct2<x;ct2--){
                            for (ct3=1;ct3<x;ct3--){
                            }
                            //wont show up, not sure why
                            //need help with this code, it just isn't cooperating
                        }
                    }
                }
                System.out.println("While Loop:");
                ct1=1;
                while(ct1<=x){
                    if(ct1%2==0){
                        ct2=1;
                        while(ct2<=ct1){
                            System.out.println(ct1);
                            ct3++;
                        }
                        System.out.println();
                        ct2++;
                    }
                    else{
                        ct2=ct1;
                        while (ct2>=1){
                            ct3=1;
                            while(ct3>=ct2){
                                System.out.println(ct1);
                                ct3=ct3+1;
                            }
                            System.out.println();
                            ct2--;
                        }
                    }
                    ct1++;
                }
            System.out.println();
            }
        }
    }
}