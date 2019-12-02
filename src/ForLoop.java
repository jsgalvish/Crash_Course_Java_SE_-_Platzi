public class ForLoop {

    static boolean isTurnOnLight = false;

    public static void printSOS(){
        System.out.println(". . . _ _ _ . . .");
    }

    public static boolean turnOnOFFLight(){
        return isTurnOnLight = (isTurnOnLight)?false: true;
    }

    public static void main(String[] args) {
        turnOnOFFLight();

        for (int i = 0; i <= 10; i++) {
            printSOS();
        }
    }
}
