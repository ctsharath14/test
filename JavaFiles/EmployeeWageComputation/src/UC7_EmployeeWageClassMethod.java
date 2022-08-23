public class UC7_EmployeeWageClassMethod {
    final int WAGE_PER_HOUR = 20;
    final int MAX_WORKING_DAY = 20;
    final int MAX_WORKING_HOUR = 100;

    public int computeEmployeeWage() {
        int empHours = 0;
        int totalWorkingHours = 0;
        int totalWorkingDays = 0;

        while(totalWorkingHours <= MAX_WORKING_HOUR && totalWorkingDays < MAX_WORKING_DAY) {
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
        int totalEmployeeWage = totalWorkingHours * WAGE_PER_HOUR;
        System.out.println("Employee total monthly wage is : "+totalEmployeeWage);
        return totalEmployeeWage;
    }
    public static void main(String[] args) {
        UC7_EmployeeWageClassMethod empWageBuilder = new UC7_EmployeeWageClassMethod();
        empWageBuilder.computeEmployeeWage();
    }
}
