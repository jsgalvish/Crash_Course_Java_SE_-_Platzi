public class Arrays {
    public static void main(String[] args) {
        String[] androidVersions = new String [17]; //Fixed size
        int days[] = new int[7];

        String[][] cities = new String[4][2];

        int [][][] numbers = new int[2][2][2];


        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Banana Bread";
        androidVersions[2] = "Cupcake";

        for (int i = 0; i < androidVersions.length ; i++) {
            System.out.println(androidVersions[i]);
        }


        for (String androidVersion : androidVersions){
            System.out.println(androidVersion);
        }

        for (int i = 0; i < days.length ; i++) {
            System.out.println(days[i]);
        }

        cities[0][0] = "Colombia";
        cities[0][1] = "Medellin";
        cities[1][0] = "Mexico";
        cities[1][1] = "Guadalajara";

        for (int i = 0; i < cities.length ; i++) {
            for (int j = 0; j < cities[i].length ; j++) {
                System.out.println(cities[i][j]);
            }
        }

        for (String[] city: cities){
            for (String name: city){
                System.out.println(name);
            }
        }
    }
}
