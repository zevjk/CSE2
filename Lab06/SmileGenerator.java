/////////////////////////////////////////////////////////////////////////////
//lab 6
//Zev Koffsky
//2/27/15
//load scanner
import java.util.Scanner;
import java.util.Random;
// define class
public class SmileGenerator{
    //main method
    public static void main(String[] args){
        for (int x=0; x<5; x+=1){
            System.out.print(":)");
        }
        System.out.println();
        int y = 0;
        while (y<5){
            System.out.print(":)");
            y+=1;
        }
        System.out.println();
        int z = 0;
        do{
            System.out.print(":)");
            z+=1;
        }while(z<5);
        System.out.println();
        int SmileNum=(int)(Math.random()*100);
        for (int i=1; i<SmileNum; i+=1){
            if (i%30==0){
                System.out.println(":)");
            }
            else{
                System.out.print(":)");
            }
        }
        System.out.println();
        int num=1;
        int inc=2;
        for(int a=1; a<SmileNum; a+=1){
            if (a==num){
                System.out.println(":)");
                num+=inc;
                inc+=1;
            }
            else{
                System.out.print(":)");
            }
        }
    }
}