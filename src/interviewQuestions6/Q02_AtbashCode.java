package interviewQuestions6;

import java.util.Locale;
import java.util.Scanner;

public class Q02_AtbashCode {
    /*
      AtbashCode ; bir metni şifrelemek veya şifresini çözmek için İbrani alfabesine temelli basit bir yöntemdir.
      "abcdefghijklmnopqrstuvwxyz"; 26 harf
      "zyxwvutsrqponmlkjihgfedcba";
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sifrelenilecek ifadeyi giriniz : ");
        String ifade = scan.nextLine().toLowerCase(Locale.ROOT);

        for (int i = 0; i < ifade.length(); i++) {
            int index = 'z' - ifade.charAt(i);
            System.out.print((char)(('a')+ index));
        }

    }

}