public class UC9_SaveTotalWage {
    final String company;
    final int wagePerHour;
    final int maxWorkingHours;
    final int maxWorkingDays;
    int totalEmployeeWage;

    public UC9_SaveTotalWage(String company, int wagePerHour, int maxWorkingHours, int maxWorkingDays) {
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.maxWorkingHours = maxWorkingHours;
        this.maxWorkingDays = maxWorkingDays;
    }

    public void computeWage() {
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
        totalEmployeeWage = totalWorkingHours * wagePerHour;
    }


    public String toString() {

        return "Total Employee wage for "+company+" is : "+totalEmployeeWage+"$";
    }

    public static void main(String[] args) {
        UC9_SaveTotalWage google = new UC9_SaveTotalWage("Google", 40, 80, 20);
        google.computeWage();
        System.out.println(google);
        System.out.println();
        UC9_SaveTotalWage microsoft = new UC9_SaveTotalWage("Microsoft", 35, 90, 22);
        microsoft.computeWage();
        System.out.println(microsoft);
    }
}
