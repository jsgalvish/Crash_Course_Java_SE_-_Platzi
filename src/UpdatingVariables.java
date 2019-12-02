public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1500;

        // thanksgiving: $200
        salary += 200;

        // heal care: $100
        salary -= 50;

        // extra hours: $30
        // food: $45
        salary += (30*2) - 45;
        System.out.println(salary);

        //update string

        String employeeName = "Sebastian";
        employeeName += " Galvis";
        System.out.println(employeeName);
    }
}
