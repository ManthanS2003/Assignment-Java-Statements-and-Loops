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
public class ReverseDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int reverse = 0;
        do {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        } while (num != 0);
        System.out.println("Reversed number: " + reverse);
    }
}

