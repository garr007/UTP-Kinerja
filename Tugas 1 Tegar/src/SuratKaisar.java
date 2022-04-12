import java.io.*;
import java.util.*;

public class SuratKaisar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String textBefore = sc.nextLine();
        int N = sc.nextInt();

        System.out.println(pergeseran(textBefore, N));

    }

    public static String pergeseran(String input, int N) {
        String textAfter = "";
        char huruf = ' ';

        for (int i = 0; i < input.length(); i++) {
            huruf = input.charAt(i);
            if (huruf >= 'a' && huruf <= 'z') {
                huruf = (char) (huruf + N);

                if (huruf > 'z') {
                    huruf = (char) (huruf - 26);
                }
                textAfter = textAfter + huruf;
            }

            else if (huruf >= 'A' && huruf <= 'Z') {
                huruf = (char) (huruf + N);

                if (huruf > 'Z') {
                    huruf = (char) (huruf - 26);
                }
                textAfter = textAfter + huruf;
            } else {
                textAfter = textAfter + huruf;
            }

        }
        return textAfter;

    }
}