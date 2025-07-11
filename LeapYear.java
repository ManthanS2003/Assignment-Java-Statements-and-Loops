/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Switch_Statement;

/**
 *
 * @author Manth
 */
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        boolean isLeap = false;
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                isLeap = true;
            }
        }
        switch(isLeap ? 1 : 0) {
            case 1: System.out.println(year + " is a Leap Year"); break;
            case 0: System.out.println(year + " is NOT a Leap Year");
        }
    }
}

