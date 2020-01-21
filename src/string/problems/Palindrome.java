package string.problems;

import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(String txt) {
        String reverse = "";
        for (int i = 0; i < txt.length(); i++) {
            reverse = txt.charAt(i) + reverse;
        }
        if (txt.equals(reverse)) {
            return true;
        } else
            return false;
    }


//        //other method
//            String original, reverse = ""; // Objects of String class
//            Scanner in = new Scanner(System.in);
//            System.out.println("Enter a string/number to check if it is a palindrome");
//            original = in.nextLine();
//            int length = original.length();
//            for (int i = length - 1; i >= 0; i--)
//                reverse = reverse + original.charAt(i);
//            if (original.equals(reverse))
//                System.out.println("Entered string/number is a palindrome.");
//            else
//                System.out.println("Entered string/number isn't a palindrome.");
//        }
//
//
//    }


    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        String txt;
        Scanner sc = new Scanner(System.in);


        System.out.println("enter a string");
        txt = sc.next();
        if (isPalindrome(txt)) {
            System.out.println(txt + " " + "is a Palindrome");
        } else {
            System.out.println(txt + " " + "is not  a Palindrome");

        }
        sc.close();
    }
}


