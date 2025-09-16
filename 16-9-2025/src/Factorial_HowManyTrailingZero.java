/*
📝 Practice Question: Trailing Zeros in Factorial

Problem:
Write a Java program that, given an integer n, calculates how many trailing zeros are in n!.

👉 Example:

5! = 120 → 1 trailing zero

10! = 3628800 → 2 trailing zeros

25! = 15511210043330985984000000 → 6 trailing zeros

Hints:

A trailing zero is produced by a factor of 10, which comes from 2 × 5.

In factorials, there are always more factors of 2 than 5, so the number of zeros depends on the number of 5s in the factors.

Formula:
- count = n/5 + n/25 + n/125 + ... (until n/5^k = 0)

IN java, ^ is not means for power of, it is XOR
 */

import java.util.Scanner;

public class Factorial_HowManyTrailingZero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int input = scan.nextInt();

        int factor = 5;
        int count = 0;

        while (true) {
            count += input / factor;
            factor *= 5;  // Manipulate the factor by multiply by 5

            if (input / factor < 1) {  // If the divide result is float, the java will convert it to 0 integer
                break;
            }
        }

        System.out.println(String.format("%d! got %d trailing zero.", input, count));
    }
}