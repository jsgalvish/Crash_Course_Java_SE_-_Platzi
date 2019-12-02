public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        System.out.println(Math.PI);
        System.out.println(Math.E);

        //integer up
        System.out.println(Math.ceil(x));
        //Integer down
        System.out.println(Math.floor(x));
        System.out.println(Math.pow(x,y));
        // Return big one
        System.out.println(Math.max(x,y));
        System.out.println(Math.sqrt(y));

        //Circle Area
        System.out.println(Math.PI * Math.pow(y,2));

        //Sphere Area
        System.out.println(4 * Math.PI * Math.pow(y,2));

        //Volume Sphere
        System.out.println((4/3)* Math.PI * Math.pow(y,3));
    }
}
