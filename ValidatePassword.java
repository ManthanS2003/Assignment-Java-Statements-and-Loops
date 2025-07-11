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
public class ValidatePassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Password : ");
        String password = sc.nextLine();
        if(password.length() < 8) {
            System.out.println("Password must be 8 Characters");
        }
        else {
            System.out.println("Password is Valid");
        }
    }
}
