import java.util.*;

class Palindrome {
    //main method
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //input
        System.out.println("Enter a string");
        String str = sc.nextLine();
        checkPalindrome(str); //calling the method

    }
    //method to check palindrome
    public static void checkPalindrome(String s){
        int count =0;
        for (int i = 0; i < s.length() / 2; i++){
        if (s.charAt(i) != s.charAt(s.length() - 1 - i)){
        count++;
    }
}
//output
        if (count == 0){
            System.out.println("The string is a palindrome.");
            }
            else {
                System.out.println("The string is not a palindrome.");
            }

    }
}
/*Enter a string
aabbaa
The string is a palindrome.
 */