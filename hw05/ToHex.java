/////////////////////////////////////////////////////////////////////////////
//hw 5
//Zev Koffsky
//2/20/15
//load scanner
import java.util.Scanner;
// define class
public class ToHex{
    //main method
    public static void main(String[] args){
        String a="a";
        String b="b";
        String c="c";
        String j="j";
        String k="k";
        String l="l";
        System.out.println("Please enter three numbers representing RGB values:");
            Scanner s = new Scanner(System.in);
                int R = s.nextInt();
                int G = s.nextInt();
                int B = s.nextInt();
                int d = R/16;
                switch (d){
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        a = String.valueOf(d);
                        break;
                    case 10:
                        a = "A";
                        break;
                    case 11:
                        a = "B";
                        break;
                    case 12:
                        a = "C";
                        break;
                    case 13:
                        a = "D";
                        break;
                    case 14:
                        a = "E";
                        break;
                    case 15:
                        a = "F";
                        break;
                }
                int e = R%16;
                switch (e){
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        b = String.valueOf(e);
                        break;
                    case 10:
                        b = "A";
                        break;
                    case 11:
                        b = "B";
                        break;
                    case 12:
                        b = "C";
                        break;
                    case 13:
                        b = "D";
                        break;
                    case 14:
                        b = "E";
                        break;
                    case 15:
                        b = "F";
                        break;
                }
                int f = G/16;
                switch (f){
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        c = String.valueOf(f);
                        break;
                    case 10:
                        c = "A";
                        break;
                    case 11:
                        c = "B";
                        break;
                    case 12:
                        c = "C";
                        break;
                    case 13:
                        c = "D";
                        break;
                    case 14:
                        c = "E";
                        break;
                    case 15:
                        c = "F";
                        break;
                }
                int g = G%16;
                switch (g){
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        j = String.valueOf(g);
                        break;
                    case 10:
                        j = "A";
                        break;
                    case 11:
                        j = "B";
                        break;
                    case 12:
                        j = "C";
                        break;
                    case 13:
                        j = "D";
                        break;
                    case 14:
                        j = "E";
                        break;
                    case 15:
                        j = "F";
                        break;
                }
                int h = B/16;
                switch (h){
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        k = String.valueOf(h);
                        break;
                    case 10:
                        k = "A";
                        break;
                    case 11:
                        k = "B";
                        break;
                    case 12:
                        k = "C";
                        break;
                    case 13:
                        k = "D";
                        break;
                    case 14:
                        k = "E";
                        break;
                    case 15:
                        k = "F";
                        break;
                }
                int i = B%16;
                switch (i){
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        l = String.valueOf(i);
                        break;
                    case 10:
                        l = "A";
                        break;
                    case 11:
                        l = "B";
                        break;
                    case 12:
                        l = "C";
                        break;
                    case 13:
                        l = "D";
                        break;
                    case 14:
                        l = "E";
                        break;
                    case 15:
                        l = "F";
                        break;
                }
                String v = a + b + c +j + k + l;
                    if (R>255|G>255|B>255|R<0|G<0|B<0){
                        System.out.println("Sorry, the input needs to be between 0 and 255");
                    }
                    else{
            System.out.println("The decimal numbers R:"+R+", G:"+G+", and B:"+B+" is represented in hexidecimal as: #"+v);
                    }
    }
}