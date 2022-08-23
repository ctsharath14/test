/*Solving using
        Switch Case
        Statement*/

public class UC4_UsingSwitchCase {
    public static void main(String[] args) {
        int empWagePerHour = 20;
        int workingHrs;
        int empCheck = (int)(Math.random() * 3);
        switch (empCheck) {
            case 1:
                System.out.println("Employee was Present and worked full time");
                workingHrs = 8;
                break;

            case 2:
                System.out.println("Employee was Present and worked Part-time");
                workingHrs = 4;
                break;

            default:
                System.out.println("Employee was Absent");
                workingHrs = 0;
                break;
        }
        int empSalary = empWagePerHour * workingHrs;
        System.out.println("Employee daily salary is :"+empSalary+"$");
    }
}
