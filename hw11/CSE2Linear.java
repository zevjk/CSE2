/////////////////////////////////////////////////////////////////////////////
//lab 10
//Zev Koffsky
//4/14/15
//load scanner
import java.util.Scanner;
// define class
public class CSE2Linear{
	//main method
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] scores = new int[15];
		for(int i=0;i<15;i++){
			try{
				System.out.println("Please enter the lowest grade");
				scores[i]=scan.nextInt();
			}catch(Exception e){
				System.out.println("Sorry, thats not a valid int");
				scan.nextLine();
				i--;
			}
			if(i>0){
				if(scores[i]<scores[i-1]){
					System.out.println("That number is lower than the one before it. Please try again.");
					i--;
				}
			}
			if(scores[i]>100){
				System.out.println("That value is over 100. Please try again");
				i--;
			}
		}
		for(int i=0;i<scores.length-1;i++){
			System.out.print(scores[i] + ", ");
		}
		System.out.println(scores[scores.length-1]);
		try{
			System.out.println("What number would you like to look for?");
			int val=scan.nextInt();
			binarySearch(scores,val);
		}catch(Exception e){
			System.out.println("Sorry, thats not a valid int");
			scan.nextLine();
		}
		randomizer(scores);
		for(int i=0;i<scores.length-1;i++){
			System.out.print(scores[i] + ", ");
		}
		System.out.println(scores[scores.length-1]);
		try{
			System.out.println("What number would you like to look for?");
			int val=scan.nextInt();
			linearSearch(scores,val);
		}catch(Exception e){
			System.out.println("Sorry, thats not a valid int");
			scan.nextLine();
		}
	}
	public static void binarySearch(int[] array, int val){
		int imin=0;
		int imax=array.length-1;
		int iterations = 0;
		while (imax >= imin)
		{
			int imid = (imin+imax)/2;
			if(array[imid] == val){
				// val found at index imid
				System.out.println(val + " was found after " + iterations + " iterations."); 
				return;
			}
			else if (array[imid] < val){
				imin = imid + 1;
				iterations++;
			}
			else {        
				imax = imid - 1;
				iterations++;
			}
		}
		System.out.println(val + " was not found after " + iterations + " iterations."); 
		return;
	}
	public static void randomizer(int[] array){
		for (int i=0; i<array.length; i++) {
			int target = (int) (array.length * 
				Math.random() );


			int temp = array[target];
			array[target] = array[i];
			array[i] = temp;
		}
	}
	public static void linearSearch(int[] array, int val){
		for(int i=0;i<array.length;i++){
			if(array[i]==val){
				System.out.println(val + " was found in the array after " + (i+1) + " iterations");
				return;
			}
		}
		System.out.println(val + " was not found in the array after " + array.length + " iterations");
		
	}
}
