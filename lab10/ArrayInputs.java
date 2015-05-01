/////////////////////////////////////////////////////////////////////////////
//lab 10
//Zev Koffsky
//4/3/15
//load scanner
import java.util.Scanner;
// define class
public class ArrayInputs{
    //main method
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("please enter the size of the array:");
        int x = scan.nextInt();
        int y = x;
        int z=0;
        int j;
        int[] array = new int [x];
        for (int o=0; o<array.length; o++){
            z=0;
            System.out.print("Please enter the value for item number "+(o+1)+" out of "+(y)+" in the array:");
            j=scan.nextInt();
            z=intCheck(j);
            array[o]=j;
            if (z!=0){
                System.out.println("That number was negative, and as such, doesnt count");
                o=o-1;
            }
            
        }
        System.out.print("[");
        for(int o=0; o<array.length; o++){
            System.out.print(array[o]);
        }
        System.out.println("]");
    }
    public static int intCheck(int n){
        if (n<0){
            return 1;
        }
        else{
            return 0;
        }
    }
}