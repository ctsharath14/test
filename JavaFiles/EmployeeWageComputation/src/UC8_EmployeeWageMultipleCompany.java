public class UC8_EmployeeWageMultipleCompany {
    public int computeEmployeeWage(String company, int wagePerHour, int maxWorkingHours, int maxWorkingDays) {
        int empHours = 0;
        int totalWorkingHours = 0;
        int totalWorkingDays = 0;

        while(totalWorkingHours <= maxWorkingHours && totalWorkingDays < maxWorkingDays) {
            totalWorkingDays ++;
            int empCheck = (int) (Math.random()*3);

            switch (empCheck) {
                case 1:
                    System.out.println("Employee is present and working full time");
                    empHours = 8;
                    break;

                case 2:
                    System.out.println("Employee is present and working part time");
                    empHours = 4;
                    break;

                default:
                    System.out.println("Employee is absent");
                    empHours = 0;
                    break;
            }
            totalWorkingHours = totalWorkingHours + empHours;
            System.out.println("Total working days is : "+totalWorkingDays);
            System.out.println("Total working hours is : "+totalWorkingHours);
            System.out.println("<-------------------------------------------------------------->");
        }
        int totalEmployeeWage = totalWorkingHours * wagePerHour;
        System.out.println(company+" employee total monthly wage is : "+totalEmployeeWage+"$");
        return totalEmployeeWage;
    }
    public static void main(String[] args) {
        UC8_EmployeeWageMultipleCompany office = new UC8_EmployeeWageMultipleCompany();
        office.computeEmployeeWage("Google", 40, 80, 20);
        System.out.println("");
        office.computeEmployeeWage("Microsoft", 35, 90, 22);
    }
}
