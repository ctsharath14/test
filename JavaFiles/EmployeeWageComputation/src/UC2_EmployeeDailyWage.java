/*Calculate Daily
        Employee Wage
        - Assume Wage per Hour is 20
        - Assume Full Day Hour is 8*/

public class UC2_EmployeeDailyWage {
    public static void main(String[] args) {
        int empWagePerHour = 20;
        int workingHrs;
        int empCheck = (int)(Math.random() * 2);
        if (empCheck == 1) {
            System.out.println("Employee is Present");
            workingHrs = 8;
        }
        else {
            System.out.println("Employee is Absent");
            workingHrs = 0;
        }
        int empSalary = workingHrs * empWagePerHour;
        System.out.println("Employee daily salary is "+empSalary+"$");
    }
}
