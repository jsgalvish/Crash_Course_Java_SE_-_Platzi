public class DataTypes {
    public static void main(String[] args) {
        // 9 digits
        int n = 999999999;
        // need a L at the end
        long nL = 999999999999999999L;
        double nD = 123.456;
        // need a F at the end
        float nf = 123.456F;

        var salary = 1500;
        var pension = salary * .03;
        var totalSalary = salary - pension;

        var employeeName = "Test Employee";
        System.out.println("EMPLOYEE: " + employeeName + " Salary: " + totalSalary);
    }
}
