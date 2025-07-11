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
public class CheckPositiveNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number  : ");
        int num = sc.nextInt();
        if(num > 0) {
            System.out.println("Number is Positive...");
        }
        else {
            System.out.println("Number is Negative...");
        }
    }
}
