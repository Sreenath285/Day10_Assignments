public class Main {
    /*
        Program to compute employee wage
     */

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");
        // init isPresent, wagePerHr, fullDayHr
        // init empCheck and printing whether emp present or absent randomly
        // calculating daily employee wage
        int isPresent = 1;
        int wagePerHr = 20;
        int fullDayHr = 8;
        int dailyWage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == isPresent) {
            dailyWage += wagePerHr * fullDayHr;
            System.out.println("Employee is present");
            System.out.println("Daily wage : " + dailyWage);
        }
        else {
            System.out.println("Employee is absent");
            System.out.println("Daily wage : " + dailyWage);
        }

    }
}
