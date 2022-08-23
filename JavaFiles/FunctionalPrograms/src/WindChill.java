/*Program that takes two double command-line arguments t and v and prints the wind chill.
 Use Math.pow(a, b) to compute ab. Given the temperature t (in Fahrenheit) and the wind speed v
 (in miles per hour), the National Weather Service defines the effective temperature
 (the wind chill) to be:
 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16)*/

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        double temp, vel;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature of the wind");
        temp = sc.nextInt();
        System.out.println("Enter the wind speed");
        vel = sc.nextInt();
        sc.close();

        double windChill = 35.74 + (0.6215*temp) + ((0.425*temp) - 35.75) * (Math.pow(vel, 0.16));
        System.out.println("Wind temperature is : "+temp+" F");
        System.out.println("Wind velocity is : "+vel+" miles/hour");
        System.out.println("Wind chill is : "+windChill);
    }
}
