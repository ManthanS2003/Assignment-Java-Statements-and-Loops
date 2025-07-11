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
public class DivBy5 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        if(num%5==0) {
            System.out.println(num + " Number is Divible by 5");
        }
        else {
            System.out.println(num + " Number is not Divisible by 5");
        }
    }
}
