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
public class TemperatureCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in (°C): ");
        int temp = sc.nextInt();
        if (temp >= 35) {
            System.out.println("Hot");
        } else if (temp >= 20) {
            System.out.println("Warm");
        } else {
            System.out.println("Cold");
        }
    }
}

