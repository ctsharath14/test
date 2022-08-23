/*Calculate Wages till
        a condition of total
        working hours or
        days is reached for
        a month
        - Assume 100 hours and 20 days*/

public class UC6_MaxWorkingHours {
    public static void main(String[] args) {
        int maxWorkingDays = 20;
        int maxWorkingHours = 100;
        int wagePerHour = 20;
        int day = 0;
        int totalWorkingHrs = 0;
        int empHr;
        while (day <= maxWorkingDays && totalWorkingHrs < maxWorkingHours) {
            day ++;
            int empCheck = (int)(Math.random() * 3);
            switch (empCheck) {
                case 1:
                    empHr = 8;
                    break;

                case 2:
                    empHr = 4;
                    break;

                default:
                    empHr = 0;
                    break;
            }
            totalWorkingHrs = totalWorkingHrs + empHr;
        }
        int empSalary = totalWorkingHrs * wagePerHour;
        System.out.println("Employee total working hours in a month is : "+totalWorkingHrs+" Hours");
        System.out.println("Employee monthly salary is : "+empSalary+"$");
    }
}
