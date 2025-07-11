/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package While_Loop;

/**
 *
 * @author Manth
 */
import java.util.Scanner;
public class Fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int i = 1, fact = 1;
        while (i <= n) {
            fact *= i;
            i++;
        }
        System.out.println("Factorial = " + fact);
    }
}

