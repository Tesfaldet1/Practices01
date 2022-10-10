package Practices01;

import java.util.Scanner;

    public class Leap_year {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("input the year you want execute ");
            int Year = in.nextInt();
            boolean A = (Year % 4) == 0;
            boolean B = (Year % 100) !=0;
            boolean C = ((Year % 100 == 0) && (Year % 400==0));

            if ( A && (B||C)) {
                System.out.println("this year is a leap year" + Year);

            }
            else
            {
                System.out.println("this year is not leap year " + Year);
            }

        }

    }

