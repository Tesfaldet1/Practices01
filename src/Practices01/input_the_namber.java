package Practices01;
import java.util.Scanner;

public class input_the_namber {
    public static void main(String[] args) {
        /* 6. Create a program that asks user to input two numbers and print
        the sum/multiplication/division
        and subtraction of given numbers
         */
        double _number1, _number2, sum, pro,div,mul,sub;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        _number1 = sc.nextInt();

        System.out.println("Enter the second number:");
        _number2 = sc.nextInt();
         sum = _number1 + _number2;
         pro = _number1 * _number2;
         div = _number1/_number2;
         sub = _number1 - _number2;
        System.out.println("the sum of the number  : " +sum +"the pro of the num : " + pro +" the div of the num: " + div + " the sub of the:  " + sub );
    }
}
