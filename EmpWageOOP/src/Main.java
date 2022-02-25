public class Main {
      /*
        Program to compute employee wage
     */

    /*
    init constants
     */
    private static final int isFullTime = 1;
    private static final int isPartTime = 2;
    private static final int wagePerHr = 20;
    private static final int noOfWorkingDays = 20;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        // init wagePerHr, fullDayHr, partTimeHr, dailyWage
        // init empCheck and printing whether employee working full time or part time randomly
        int empWorkHrs = 0, dailyWage = 0, monthlyWage = 0;
        // calculating monthly wage
        for (int i = 0; i <= noOfWorkingDays; i++) {
            double empCheck = Math.floor(Math.random() * 10) % 3;
            switch ((int) empCheck) {
                case isFullTime :
                    System.out.println("Employee is present and working full time");
                    empWorkHrs = 8;
                    break;
                case isPartTime :
                    System.out.println("Employee is present and working part time");
                    empWorkHrs = 4;
                    break;
                default :
                    System.out.println("Employee is absent");
                    empWorkHrs = 0;
            }
            dailyWage = wagePerHr * empWorkHrs;
            monthlyWage += dailyWage;
            System.out.println("Daily wage : " + dailyWage);
        }
        System.out.println("Monthly wage : " + monthlyWage);
    }
}
