/////////////////////////////////////////////////////////////////////////////
//hw 12
//Zev Koffsky
//4/23/15
//load scanner
import java.util.Scanner;
import java.util.Random;
// define class
public class Multiply{
	//main method
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a width for the array:");
		int width = scan.nextInt();
		System.out.print("Please enter a height for the array:");
		int height = scan.nextInt();
		int [][] array = randomMatrix(width, height);
		int [][] array2 = randomMatrix(width, height);
		int [][] array3 = matrixMultiply(array, array2);
		for (int o=0; o<width; o++){
			System.out.print("[ ");
			for (int p=0; p<height; p++){
				System.out.print(array3[o][p]+" ");
			}
			System.out.print("]");
			System.out.println("");
		}
	}
	//didnt have lab 12 done, made a process myself to make the random numbers
	//works totally fine
	public static int[][] randomMatrix(int width, int height){
	    int[][] array = new int[width][height];
	    for(int i=0; i<width; i++){
	    	for(int k=0; k<height; k++){
	    		int j=(int)((Math.random())*10);
	    		if ((Math.random())*10>5){
	    			j=j*(-1);
	    		}
	    		array[i][k]=j;
	    	}
	    }
	    return array;
	}
	
	public static int[][] matrixMultiply(int[][] n, int[][] m){
		for(int i=0; i<n.length; i++){
	    	for(int k=0; k<n[0].length; k++){
	    		n[i][k]=n[i][k]*m[i][k];
	    	}
		}
		return n;
	}
}