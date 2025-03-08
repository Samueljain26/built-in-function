import java.util.*;

class Calculator {
    //main method
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //input
        System.out.println("Enter 2 numbers: ");
        double num1 =sc.nextDouble();
        double num2 =sc.nextDouble();
        System.out.println("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0); //string input but its only 1 char so charAt(0)
        //calling methods and output
        if(operator == ('+')){
            System.out.println(num1 + " + " + num2 + " = " + toAdd(num1, num2));
        }
        else if(operator == ('-')){
            System.out.println(num1 + " - " + num2 + " = " + toSubtract(num1, num2));
        }
        else if(operator == ('*')){
            System.out.println(num1 + " * " + num2 + " = " + toMultiply(num1, num2));
        }
        else if(operator == ('/')){
            System.out.println(num1 + " / " + num2 + " = " + toDivide(num1, num2));
        }

    }
    //method to add
    public static double toAdd(double num1,double num2){
        return num1+num2;
    }
    //method to subtract
    public static double toSubtract(double num1,double num2){
        return num1-num2;
    }
    //method to multiply
    public static double toMultiply(double num1,double num2){
        return num1*num2;
    }
    //method to divide
    public static double toDivide(double num1,double num2){
        return num1/num2;
    }
}
/*Enter 2 numbers: 
4
5
Enter operator (+, -, *, /): 
+
4.0 + 5.0 = 9.0
 */