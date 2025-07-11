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
public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int largest = 0;
        do {
            int digit = num % 10;
            if (digit > largest) {
                largest = digit;
            }
            num /= 10;
        } while (num != 0);
        System.out.println("Largest digit: " + largest);
    }
}

