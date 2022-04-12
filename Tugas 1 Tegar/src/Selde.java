import java.io.*;
import java.util.*;

public class Selde {


        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if (input == cek(input)) {
            System.out.printf("%d adalah selde.\n", input);
        } else {
            System.out.printf("%d bukan selde.\n", input);
        }
    }

    public static int cek(int input) {
        int balik = 0;
        while (input != 0) {
            balik = balik * 10;
            balik = balik + input % 10;
            input = input / 10;

        }
        return balik;
    }
}