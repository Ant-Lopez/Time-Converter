/**
 * Java source code needed to calculate how many hours, mins and seconds are in 5000 seconds.
 */
import java.util.Scanner;
public class Time {
   public static void main(String[] args) {
     Scanner ANT = new Scanner(System.in);
     
     System.out.println("Enter the number of seconds you wish to convert.");
     //int seconds = 5000;
     int seconds =ANT.nextInt();
     int hours = seconds /3600;
     int minutes =( seconds % 3600) / 60;
     int newseconds = (seconds% 3600)% 60  ;
     System.out.println(hours+":"+minutes+":"+newseconds);
  
}
}