/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package While_Loop;

/**
 *
 * @author Manth
 */
import java.util.Random;
public class RandomUntil50 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = 0;
        while (num != 50) {
            num = rand.nextInt(100); // generate 0 to 99
            System.out.println("Generated: " + num);
        }
        System.out.println("Reached 50!");
    }
}

