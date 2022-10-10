package Practices01;

public class Average_of_the_numbers {
    public static void main(String[] args) {
        /*
        4. Write a Java program that prints the average of three numbers
Expected result:
(23 + 11 + 77) / 3 = 37
         */
        int _number1 = 23;
        int _number2 = 11;
        int _number3 = 77;
        int sum = _number1 + _number2 + _number3;
        int avg = sum/3;
        System.out.println("Expected result:"  );
        System.out.println(avg);

    }
}
