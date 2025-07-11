/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package if_statement;

/**
 *
 * @author Manth
 */
import java.util.Scanner;
public class CheckAdult {
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();
        if(age >=18 ) {
            System.out.println("You are Adult...");
        }
        else {
            System.out.println("You are Not Adult...");
        }
    }
}
