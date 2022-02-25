public class Main {
      /*
        Program to compute employee wage
     */

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program\n");

        Employee actEmp = new Employee("ACT", 10, 10, 50);
        actEmp.calculateEmpWage();

        Employee trendsEmp = new Employee("Trends", 20, 20, 100);
        trendsEmp.calculateEmpWage();

    }
}
