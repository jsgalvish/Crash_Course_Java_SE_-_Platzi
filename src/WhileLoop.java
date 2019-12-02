public class WhileLoop {

    static boolean isTurnOnLight = false;

    public static void printSOS(){
        System.out.println(". . . _ _ _ . . .");
    }

    public static boolean turnOnOFFLight(){
        return isTurnOnLight = (isTurnOnLight)?false: true;
    }

    public static void main(String[] args) {
        turnOnOFFLight();

        int i = 1;
        while(isTurnOnLight && i <= 10){
            printSOS();
            i++;
        }
    }




}
