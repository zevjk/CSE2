/////////////////////////////////////////////////////////////////////////////
//Lab 2
//Zev Koffsky
//1/30/15
//define class
public class Cyclometer{
    
    //main method, needed for every java program
    public static void main(String[] args) {


    //input data
    int secsTrip1=480;  //length of trip 1 
    int secsTrip2=3220;  //length of trip 2
    int countsTrip1=1561;  //number of times trip 1 was taken
    int countsTrip2=9037; //number of times trip 2 was taken
        
    //intermediate variables and output data
    double wheelDiameter=27.0,  //size of the bike wheel
    PI=3.14159, //pi
    feetPerMile=5280,  //feet in a mile
    inchesPerFoot=12,   //inches in a foot
    secondsPerMinute=60;  //seconds in a minute
    double distanceTrip1, distanceTrip2,totalDistance;  //doubling the 
    //distances of the trips and the total distance
    
    System.out.println("Trip 1 took "+
        (secsTrip1/secondsPerMinute)+" minutes and had "+
        countsTrip1+" counts.");
    System.out.println("Trip 2 took "+
        (secsTrip2/secondsPerMinute)+" minutes and had "+
        countsTrip2+" counts.");

    distanceTrip1=countsTrip1*wheelDiameter*PI;
        // Above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
    distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    totalDistance=distanceTrip1+distanceTrip2;

//Print out the output data.
    System.out.println("Trip 1 was "+distanceTrip1+" miles");
    System.out.println("Trip 2 was "+distanceTrip2+" miles");
    System.out.println("The total distance was "+totalDistance+" miles");

    }//end of main method
}//end of class