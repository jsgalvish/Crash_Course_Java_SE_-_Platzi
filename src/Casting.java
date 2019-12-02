public class Casting {
    public static void main(String[] args) {

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        // Cast truncate
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        int a = 30;
        int b = 12;
        System.out.println((double)a/b);

        double c = a/b; //wrong cast
        System.out.println(c);

        char n = '1';
        int nI = n; //ASCII
        System.out.println(nI);

        short nS = (short) n;
        System.out.println(nS);
    }
}
