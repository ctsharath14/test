/*Calculating Wages
        for a Month
        - Assume 20 Working Day per Month*/

public class UC5_EmployeeMonthlyWage {
    public static void main(String[] args) {
        int empWagePerHour = 20;
        int maxWorkingDays = 20;
        int totalSalary = 0;
        int workingHrs;
        int day;
        for (day = 0; day < maxWorkingDays; day++) {
            int empCheck = (int) (Math.random() * 3);
            switch (empCheck) {
                case 1:
                    workingHrs = 8;
                    break;

                case 2:
                    workingHrs = 4;
                    break;

                default:
                    workingHrs = 0;
                    break;
            }
            int empWage = workingHrs * empWagePerHour;
            totalSalary = totalSalary + empWage;
        }
        System.out.println("Employee monthly salary is : "+totalSalary+"$");
    }
}
