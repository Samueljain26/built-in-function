import java.util.*;

class PrimeNumber {
    //main method
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //input
        System.out.println("Enter a number");
        int number = sc.nextInt();
        checkPrime(number); //calling the method

    }
    public static void checkPrime(int n){
        int count =0;
        //to check if prime
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                count++;
        }
    }
    //output
        if(count==0){
            System.out.println(n+" is a prime number");
            }
            else{
                System.out.println(n+" is not a prime number");
    }
}
}
/*Enter a number
10
10 is not a prime number
 */