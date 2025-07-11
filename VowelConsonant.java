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
public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = Character.toLowerCase(sc.next().charAt(0));
        switch (ch) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
                System.out.println("Vowel"); break;
            default:
                if (Character.isLetter(ch))
                    System.out.println("Consonant");
                else
                    System.out.println("Not a letter");
        }
    }
}
