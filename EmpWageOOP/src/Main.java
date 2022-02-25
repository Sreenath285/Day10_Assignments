public class Main {
    /*
        Program to compute employee wage
     */

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");
        // init isFullTime, is PartTime, wagePerHr, fullDayHr, partTimeHr, dailyWage
        // init empCheck and printing whether employee working full time or part time randomly
        // calculating daily employee wage
        int isFullTime = 1;
        int isPartTime = 2;
        int wagePerHr = 20;
        int fullDayHr = 8;
        int partTimeHr = 4;
        int dailyWage = 0;

        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == isFullTime) {
            dailyWage += wagePerHr * fullDayHr;
            System.out.println("Employee is present and working full time");
            System.out.println("Daily wage : " + dailyWage);
        }
        else if (empCheck == isPartTime) {
            dailyWage += wagePerHr * partTimeHr;
            System.out.println("Employee is present and working part time");
            System.out.println("Daily wage : " + dailyWage);
        }
        else {
            System.out.println("Employee is absent");
            System.out.println("Daily wage : " + dailyWage);
        }

    }
}
