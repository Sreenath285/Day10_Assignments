public class Main {

       /*
        Program to compute employee wage
     */

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        // init isPresent and printing whether emp present or absent randomly
        // init empCheck
        int isPresent = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == isPresent) {
            System.out.println("Employee is present");
        }
        else {
            System.out.println("Employee is absent");
        }

    }
}
