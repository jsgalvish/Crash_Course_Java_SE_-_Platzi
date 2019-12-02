public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true;
        int fileSended = 3;

        if (isBluetoothEnabled){
            fileSended++;
            System.out.println("File Send");
        } else {
            System.out.println("Please enable your Bluetooth");
        }
    }
}
