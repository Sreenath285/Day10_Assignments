public class Employee implements EmpWageBuilder{


    /*
        init constants
     */
    public static final int isFullTime = 1;
    public static final int isPartTime = 2;

    // init instance variables
    private String companyName;
    private final int wagePerHr;
    private final int noOfWorkingDays;
    private final int maxHrs;

    //    constructor
    public Employee(String companyName, int wagePerHr, int noOfWorkingDays, int maxHrs) {
        this.companyName = companyName;
        this.wagePerHr = wagePerHr;
        this.noOfWorkingDays = noOfWorkingDays;
        this.maxHrs = maxHrs;
    }

    @Override
    public int calculateEmpWage() {
        // init wagePerHr, fullDayHr, partTimeHr, dailyWage
        // init empCheck and printing whether employee working full time or part time randomly
        int empWorkHrs = 0, dailyWage = 0, monthlyWage = 0, totalWorkDays = 0, totalWorkHrs = 0;

        // calculating wage till total working hours and days reached
        while (totalWorkHrs <= maxHrs && totalWorkDays < noOfWorkingDays) {
            totalWorkDays++;
            double empCheck = Math.floor(Math.random() * 10) % 3;
            switch ((int) empCheck) {
                case isFullTime:
//                    System.out.println("Employee is present and working full time");
                    empWorkHrs = 8;
                    break;
                case isPartTime:
//                    System.out.println("Employee is present and working part time");
                    empWorkHrs = 4;
                    break;
                default:
//                    System.out.println("Employee is absent");
                    empWorkHrs = 0;
            }
            totalWorkHrs += empWorkHrs;
            dailyWage = wagePerHr * empWorkHrs;
            monthlyWage += dailyWage;
//            System.out.println("Daily wage : " + dailyWage);
        }
        System.out.println("Total work hours : " + totalWorkHrs);
        System.out.println("Total work days : " + totalWorkDays);
        System.out.println(companyName + " Employee Monthly wage : " + monthlyWage + "\n");

        return monthlyWage;
    }
}
