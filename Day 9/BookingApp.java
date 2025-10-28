package Day 9;
import java.util.Scanner;

abstract class Ride{
    abstract int calculateFare(int distance);
    public void rideType(){
        System.out.println("Generic Ride.");
    }
}
class AutoRide extends Ride{
    public int calculateFare(int distance){
        int fare = distance * 10;
        return fare;
    }
    public void rideType(){
        System.out.println("Auto Ride.");
    }

}
class CarRide extends Ride{
    public int calculateFare(int distance){
        int fare = distance * 20;
        return fare;
    }
     public void rideType(){
        System.out.println("Car Ride.");
    }
}

public class BookingApp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ride type (Auto/Car) : ");
        String type = sc.nextLine();
        System.out.println("Enter distance in km: ");
        int distance = sc.nextInt();
        if(type .equalsIgnoreCase("auto")){
            AutoRide A = new AutoRide();
            A.rideType();
            int cost = A.calculateFare(distance);
             System.out.println("Rs."+ cost);
        }
        else{
           CarRide B = new CarRide();
            B.rideType();
            int cost = B.calculateFare(distance);
             System.out.println("Rs."+ cost); 
        }
        sc.close();

    }
}
