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
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        if(n%2==0) {
            System.out.println(n+" is Even Number");
        }
        else {
            System.out.println(n+" is Odd Number");
        }
    }
}
