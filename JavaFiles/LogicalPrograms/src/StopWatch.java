/*Simulate Stopwatch Program
        a. Desc -> Write a Stopwatch Program for measuring the time that elapses between
        the start and end clicks
        b. I/P -> Start the Stopwatch and End the Stopwatch
        c. Logic -> Measure the elapsed time between start and end
        d. O/P -> Print the elapsed time.*/

import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        long startTime = 0;
        long endTime = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 's' to start the stop watch");
        String in = sc.nextLine();
        if (in.equals("s")) {
            System.out.println("Stop watch has started");
            startTime = System.currentTimeMillis();

            System.out.println("Enter 'e' to stop the stop watch");
            in = sc.nextLine();
            if (in.equals("e")) {
                System.out.println("Stop watch has stopped");
                endTime = System.currentTimeMillis();
                long timeDifference = endTime - startTime;
                int hh = (int) timeDifference / (1000*60*60);
                int mm = (int) timeDifference / (1000*60);
                int ss = (int) timeDifference / 1000;
                int ms = (int) timeDifference % 1000;
                System.out.println("The recorded time is = "+hh+":"+mm+":"+ss+":"+ms);
            } else {
                System.out.println("Entered input is invalid");
            }
        }
        else {
            System.out.println("Entered input is invalid");
        }
    }
}
