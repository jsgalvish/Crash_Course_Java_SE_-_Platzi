import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int response = 0;
        do{
            System.out.println("Select your option");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 0:
                    System.out.println("Thanks for using the menu");
                    break;
                case 1:
                    System.out.println("Movies");
                    break;
                case 2:
                    System.out.println("Series");
                default:
                    System.out.println("Select a option");
            }
        } while ( response != 0 );

    }
}
