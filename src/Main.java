public class Main {
    public static void main(String[] args) {
        printConversion(-1);
        printConversion(1.5);
    }

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            return -1;
        }else if(kilometersPerHour > 0 ){
            return Math.round(kilometersPerHour/1.609);
        }
        return 0;
    }

    public static void printConversion(double kilometersPerHour){

        boolean result = toMilesPerHour(kilometersPerHour) == -1 ? false : true;

        if (!result){
            System.out.println("Invalid Output");
        }else {
            System.out.println(kilometersPerHour +" km/h = "+ toMilesPerHour(kilometersPerHour)+" mi/h");
        }


    }

}