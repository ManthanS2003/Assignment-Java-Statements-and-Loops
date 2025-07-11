/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package else_if_statement;

/**
 *
 * @author Manth
 */
import java.util.Scanner;
public class DiscountCalci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        int amount = sc.nextInt();
        if (amount >= 2000) {
            System.out.println("You get 20% discount");
        } else if (amount >= 1000) {
            System.out.println("You get 10% discount");
        } else {
            System.out.println("No discount");
        }
    }
}
