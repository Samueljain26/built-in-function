import java.util.*;

class TemperatureConvert {
    //main method
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //input
        System.out.print("Enter temperature : ");
        double temp = sc.nextDouble();
        System.out.println("to which unit you want to convert(C/F):  ");
        char unit = sc.next().charAt(0);
        //checking if conversion in C or F and output
        if(unit ==('C')){
            System.out.println("Temperature in Celcius: " + toCelcius(temp));
        }
        else if(unit ==('F')){
            System.out.println("Temperature in Fahrenheit: " + toFahrenheit(temp));
        }
    }
    //method to convert Fahrenheit to celcius
    public static double toCelcius(Double temp){
        return (temp - 32) * 5.0 / 9.0;
    }
    //method to convert celcius to fahrenheit
    public static double toFahrenheit(Double temp){
        return (temp*9.0)/5.0 + 32;
}

}
/*Enter temperature : 
27
to which unit you want to convert(C/F):  
F
Temperature in Fahrenheit: 80.6
 */