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
public class GreaterNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number a Check Greater than 100 or not : ");
        int n = sc.nextInt();
        if(n>100) {
            System.out.println(n+ " is Greater than 100");
        }
        else {
            System.out.println(n+ " is not Greater than 100");
        }
    }
}
