public class Functions {

    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }

    public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }

    public static double sphereVolume(double r){
        return (4/3) * Math.PI * Math.pow(r,3);
    }

    /**
     * Description: Transform MXN or COP to USD
     * @param quantity value to evaluate
     * @param currency type of currency MXN or COP
     * @return quantity in USD
     */
    public static double convertToDollar(double quantity, String currency)
    {
        switch (currency){
            case "MXM":
                return quantity *= 0.052;
            case "COP":
                return quantity *= 0.00031;
            default:
                return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println(circleArea(8));
        System.out.println(convertToDollar(1000,"COP"));
    }
}
