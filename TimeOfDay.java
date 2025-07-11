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
public class TimeOfDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hour (0-23): ");
        int hour = sc.nextInt();
        if (hour >= 5 && hour < 12) {
            System.out.println("Morning");
        } else if (hour >= 12 && hour < 17) {
            System.out.println("Afternoon");
        } else if (hour >= 17 && hour < 20) {
            System.out.println("Evening");
        } else {
            System.out.println("Night");
        }
    }
}
