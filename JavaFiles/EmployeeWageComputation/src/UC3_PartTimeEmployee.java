/*Add Part time
        Employee & Wage
        - Assume Part time Hour is 8*/

public class UC3_PartTimeEmployee {
    public static void main(String[] args) {
        int empWagePerHour = 20;
        int workingHrs;
        int empCheck = (int)(Math.random() * 3);
        if (empCheck == 1) {
            System.out.println("Employee was Present and worked full time");
            workingHrs = 8;
        }
        else if (empCheck == 2) {
            System.out.println("Employee was Present and worked Part-time");
            workingHrs = 4;
        }
        else {
            System.out.println("Employee was Absent");
            workingHrs = 0;
        }
        int empSalary = empWagePerHour * workingHrs;
        System.out.println("Employee daily salary is :"+empSalary+"$");
    }
}
