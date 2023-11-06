/*
*   Name:
*   Section:
*
*   Academic Honesty Pledge:
*   "I have neither given nor received any unauthorized aid on this piece of work."
*
*   Signed ______  Date _______
* */

import org.w3c.dom.ls.LSOutput;

public class Main {

    // Question 1 - calculateGrade
    public static char calculateGrade(int n){
        if (n>=95){
            return 'A';
        }
        else if (n>=85 && n<=94){
            return 'B';
        }
        else if (n>=75 && n<=84){
            return 'C';
        }
        else if (n>=65 && n<=74){
            return 'D';
        }
        else if (n>=55 && n<=64){
            return 'E';
        }
        else {
            return 'F';
        }
    }

    // Question 2 - fizzBuzz
    public static String fizzBuzz(int n){
        if (n%2 == 0 && n%7 == 0){
            return "fizzbuzz";
        }
        if (n%2 == 0){
            return "fizz";
        }
        if (n%7 == 0){
            return "buzz";
        }
        else{
            return "unlucky";
        }
    }

    // Question 3 - frontBack
    public static String backFront(String input){
        int length = input.length();

        if (length < 2){
            return input;
        }
        else {
            char last = input.charAt(length-1);
            char secLast = input.charAt(length-2);
            String lastTwo = "" + secLast + last;
            return lastTwo + input + lastTwo;
        }
    }

    // Question 4 - twoAsOne
    public static boolean twoAsOne(int a, int b, int c){
        if (a*b == c || a*c == b || b*c == a){
            return true;
        }
        else{
            return false;
        }
    }

    // Question 5 - endDown
    public static String endDown(String input){
        int length = input.length();

        if (length < 3){
            return input.toLowerCase();
        }
        else {
            String original = input.substring(0, length-3);
            String lastThree = input.substring(length-3);
            lastThree = lastThree.toLowerCase();
            return original + lastThree;
        }
    }

}
