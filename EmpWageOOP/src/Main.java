public class Main {
     /*
        Program to compute employee wage
     */

    /*
    init isFullTime, isPartTime constants
     */
    private static final int isFullTime = 1;
    private static final int isPartTime = 2;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");
        // init wagePerHr, fullDayHr, partTimeHr, dailyWage
        // init empCheck and printing whether employee working full time or part time randomly
        // calculating daily employee wage

        int wagePerHr = 20;
        int fullDayHr = 8;
        int partTimeHr = 4;
        int dailyWage = 0;

        double empCheck = Math.floor(Math.random() * 10) % 3;
        switch ((int) empCheck) {
            case isFullTime :
                dailyWage += wagePerHr * fullDayHr;
                System.out.println("Employee is present and working full time");
                System.out.println("Daily wage : " + dailyWage);
                break;
            case isPartTime :
                dailyWage += wagePerHr * partTimeHr;
                System.out.println("Employee is present and working part time");
                System.out.println("Daily wage : " + dailyWage);
                break;
            default :
                System.out.println("Employee is absent");
                System.out.println("Daily wage : " + dailyWage);
        }
    }
}
