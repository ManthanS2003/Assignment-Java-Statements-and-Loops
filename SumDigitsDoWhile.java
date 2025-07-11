/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package do_While_Loop;

/**
 *
 * @author Manth
 */
import java.util.Scanner;
public class SumDigitsDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        do {
            sum += num % 10;
            num /= 10;
        } while (num != 0);
        System.out.println("Sum of digits: " + sum);
    }
}

