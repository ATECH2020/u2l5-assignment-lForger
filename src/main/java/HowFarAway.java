import java.util.Scanner;
 
public class HowFarAway
{
   public static void main(String[] args)
   {
       //Creates a scanner
       Scanner in = new Scanner(System.in);
       //Creates all varriables
       double firstLatitude, firstLongitude, otherLatitude, otherLongitude, distance = 0;
       //Accepts longitude and latitude of both locations from user
       System.out.println("Input the first latitude ");
       firstLatitude = in.nextDouble();
       System.out.println("Input the first longitude ");
       firstLongitude = in.nextDouble();
       System.out.println("Input the second latitude ");
       otherLatitude = in.nextDouble();
       System.out.println("Input the second longitude ");
       otherLongitude = in.nextDouble();
       //Creates two geoLocation objects
       GeoLocation firstLocation = new GeoLocation(firstLatitude, firstLongitude);
 
       GeoLocation otherLocation = new GeoLocation(otherLatitude, otherLongitude);
       //Finds and prints the distance between the two locations
       distance = firstLocation.distanceFrom(otherLocation);
 
       System.out.println(distance);
 
    
     
   }
}
