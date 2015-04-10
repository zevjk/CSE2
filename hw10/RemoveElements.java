/////////////////////////////////////////////////////////////////////////////
//lab 10
//Zev Koffsky
//4/3/15
//load scanner
import java.util.Scanner;
import java.util.Random;
public class RemoveElements{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
    int n[]=new int[15];
    int nA1[];
    int nA2[];
    int index,target;
    String answer="";
	do{
    	System.out.print("Random input:10 ints [0-9]");
    	n = randomInput();
  	    String out = "Original array:";
    	out += listArray(n);
    	System.out.println(out);
    	System.out.print("Enter index ");
    	index = scan.nextInt();
    	nA1 = delete(n,index);
    	String out1="Output array:";
  	    out1+=listArray(nA1); //return a string of the form "{2, 3, -9}"  
  	    System.out.println(out1);
        System.out.print("Enter the target value ");
    	target = scan.nextInt();
    	nA2 = remove(nA1,target);
  	    String out2="Output array:";
    	out2+=listArray(nA2); //return a string of the form "{2, 3, -9}"  
  	    System.out.println(out2);
      	System.out.print("Again? Enter 'y' or 'Y', anything else to quit-");
      	answer=scan.next();
	    } while(answer.equals("Y") || answer.equals("y"));
  }//end main mehthod
 
 
    public static String listArray(int n[]){
	    String out="{";
	    for(int j=0;j<n.length;j++){
    	    if(j>0){
        	    out+=", ";
          	}//end if statement
      	out+=n[j];
	    }//end for statement
	    out+="} ";
	    return out;
    }//end listArray method
    
    public static int[] randomInput(){
        int[] list=new int[10];
        int control;
        for(control=0; control<10; control++){
            list[control]=(int) (Math.random()*10);
        }//end for loop
        return list;
    }//end randomInput method
    
    public static int[] delete(int[] list,int pos){
        int[] deleteArray=new int[9];
        int i=list.length;
        int j=0;
        int k=0;
        if(pos<0 || pos>9){
            System.out.println("Invalid Index");
            return list;
        }//end if statement to check index
        while(j<i){
            if(j==pos){
                j++;
                continue;
            }//end if statement
            deleteArray[k]=list[j];
            j++;
            k++;
        }//end while statement
        return deleteArray;
    }//end delete method
    
    public static int[] remove(int[] list, int target){
        int x=list.length;
        int y=0;
        int z=0;
        int count=0;
        int removed=0;
        while(y<x){
            if(list[y]==target){
                count++;
            }//end if statement that determines nbers in array
            y++;
        }//end while statement
        if(count>0){
            System.out.println("Element "+target+" found.");
        }//end if statement
         else{
            System.out.println("Element "+target+" not found.");
        }//end else statemnt
        for(z=0; z<x; z++){
            if(list[z]==target){
               removed++; 
            }//end if statement
        }//end for statement
        int length=list.length-removed;
        int[] removeArray=new int[length];
        int i=0;
        int j=0;
        z=0;
        while(i<list.length){
            if(list[i]!=target){
                removeArray[z]=list[i];
                z++;
            }//end if statemnt
            i++;
        }//end for statment
        return removeArray;
    }//end remove method
    
}//end class