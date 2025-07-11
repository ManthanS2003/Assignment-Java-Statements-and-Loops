/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package do_While_Loop;

/**
 *
 * @author Manth
 */
import java.util.Random;
public class RandomUntilGreaterThan90 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num;
        do {
            num = rand.nextInt(101); 
            System.out.println("Generated: " + num);
        } while (num <= 90);
        System.out.println("Stopped at: " + num);
    }
}
