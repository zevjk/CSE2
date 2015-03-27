/////////////////////////////////////////////////////////////////////////////
//lab 9
//Zev Koffsky
//3/27/15
//load scanner
import java.util.Random;
import java.util.Scanner;
// define class
public class lab9{
    //main method
    public static void main(String[] args){
        Random randomGenerator = new Random();
        Scanner scan = new Scanner(System.in);
        String x = " ";
        do{
            x = " ";
            String adj=adjective();
            String nounSubject=nounSubject();
            String verb=pastTenseVerbs();
            String nounObject=nounObject();
            System.out.println("The "+adj+" "+nounSubject+" "+verb+" the "+nounObject+".");
            System.out.println("Enter 'y' to see another sentence");
            x = scan.next();
        }while (x.equals("y"));
    }
    public static String adjective(){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        String adj = "";
        switch (randomInt){
            case 0: adj = "omnipotent";
                break;
            case 1: adj = "crafty";
                break;
            case 2: adj = "hardy";
                break;
            case 3: adj = "tough";
                break;
            case 4: adj = "mean";
                break;
            case 5: adj = "aggresive";
                break;
            case 6: adj = "caring";
                break;
            case 7: adj = "funny";
                break;
            case 8: adj = "ridiculous";
                break;
            case 9: adj = "incoherent";
                break;
        }
        return adj;
    }
    public static String nounSubject(){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        String nounSubject="";
        switch (randomInt){
            case 0: nounSubject = "friend";
                break;
            case 1: nounSubject = "dog";
                break;
            case 2: nounSubject = "teacher";
                break;
            case 3: nounSubject = "mouse";
                break;
            case 4: nounSubject = "house";
                break;
            case 5: nounSubject = "plane";
                break;
            case 6: nounSubject = "unicorn";
                break;
            case 7: nounSubject = "phone";
                break;
            case 8: nounSubject = "pizza";
                break;
            case 9: nounSubject = "computer";
                break;
        }
        return nounSubject;
    }
    public static String pastTenseVerbs(){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        String verb="";
        switch (randomInt){
            case 0: verb = "broke";
                break;
            case 1: verb = "ran";
                break;
            case 2: verb = "ate";
                break;
            case 3: verb = "killed";
                break;
            case 4: verb = "ended";
                break;
            case 5: verb = "threw";
                break;
            case 6: verb = "taught";
                break;
            case 7: verb = "called";
                break;
            case 8: verb = "observed";
                break;
            case 9: verb = "placed";
                break;
        }
        return verb;
    }
    public static String nounObject(){
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        String nounObject="";
        switch (randomInt){
            case 0: nounObject = "ocean";
                break;
            case 1: nounObject = "grape";
                break;
            case 2: nounObject = "maraca";
                break;
            case 3: nounObject = "macaroni";
                break;
            case 4: nounObject = "street";
                break;
            case 5: nounObject = "harbor";
                break;
            case 6: nounObject = "tomato";
                break;
            case 7: nounObject = "volleyball";
                break;
            case 8: nounObject = "sphynx";
                break;
            case 9: nounObject = "box";
                break;
        }
        return nounObject;
    }
}